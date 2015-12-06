package myproject.main;


import java.util.Scanner;

import myproject.model.Model;
import myproject.model.Property;
import myproject.model.swing.SwingAnimatorBuilder;
import myproject.ui.UI;
import myproject.ui.UIMenu;
import myproject.ui.UIMenuAction;
import myproject.ui.UIMenuBuilder;
import myproject.ui.UIError;
import myproject.ui.UIForm;
import myproject.ui.UIFormTest;
import myproject.ui.UIFormBuilder;



class Control {
	private static final int EXITED = 0;
	private static final int EXIT = 1;
	private static final int START = 2;
	private static final int SUBMENU = 3;
	private static final int NUMSTATES = 10;
	private UIMenu[] _menus;
	private int _state;
	
	 Property p = new Property();
	Scanner sc= new Scanner(System.in);
    

	private UIFormTest _numberTest;

	private UI _ui;

	Control(UI ui) {
		_ui = ui;

		_menus = new UIMenu[NUMSTATES];
		_state = START;
		addSTART(START);
		addSUBMENU(SUBMENU);
		addEXIT(EXIT);

		_numberTest = new UIFormTest() {
			public boolean run(String input) {
				try {
					Double.parseDouble(input);
					return true;
				} catch (NumberFormatException e) {
					return false;
				}
			}
		};
	}

	void run() {
		try {
			while (_state != EXITED) {
				_ui.processMenu(_menus[_state]);
			}
		} catch (UIError e) {
			_ui.displayError("UI closed");
		}
	}

	private Double buildDoubleForm(String title, String prompt) {
		UIFormBuilder form = new UIFormBuilder();
		form.add(title, _numberTest);

		UIForm _getForm = form
				.toUIForm(prompt);
		String[] result1 = _ui.processForm(_getForm);
		Double newValue = Double.parseDouble(result1[0]);

		return newValue;
	}

	private Integer buildIntegerForm(String title, String prompt) {
		UIFormBuilder form = new UIFormBuilder();
		form.add(title, _numberTest);

		UIForm _getForm = form
				.toUIForm(prompt);
		String[] result1 = _ui.processForm(_getForm);
		Integer newValue = Integer.parseInt(result1[0]);

		return newValue;
	}

	private void addSTART(int stateNum) {
		UIMenuBuilder m = new UIMenuBuilder();

		m.add("Default", new UIMenuAction() {
			public void run() {
				_ui.displayError("doh!");
			}
		});
		m.add("Run Simulation", new UIMenuAction() {
			public void run() {
				
				Model model = new Model(new SwingAnimatorBuilder());
				model.run(p.getTime());
				model.dispose();
				_state = START;

			}
		});
		m.add("Change Simulation Parameters", new UIMenuAction() {
			public void run() {
				_state = SUBMENU;
			}
		});
		m.add("Exit", new UIMenuAction() {
			public void run() {
				_state = EXIT;
			}
		});

		_menus[stateNum] = m.toUIMenu("Main Menu");
	}

	private void addSUBMENU(int stateNum) {
		
		UIMenuBuilder m = new UIMenuBuilder();

		m.add("Default", new UIMenuAction() {
			public void run() {
				_ui.displayError("doh!");
			}
		});
		m.add("Show current values", new UIMenuAction() {
			public void run() {
				System.out.println(p.toString());
			}
		});
		m.add("Simulation time step", new UIMenuAction() {
			public void run() {
				
				System.out.println("Please enter a value between [ Min:50 | Max:1000 ]");
				int in = sc.nextInt();
				if(in < 50 || in > 1000)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setTime(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}
				
			}


		});
		m.add("Car entry rate", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:1 | Max:5 ]");
				int in = sc.nextInt();
				if(in < 1 || in > 5)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setNumberOfCars(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}
			}
		});
		m.add("Cars-generator delay time", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:50 | Max:200 ]");
				int in = sc.nextInt();
				if(in < 50 || in > 200)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setCarsGeneratorDelayTime(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}
			}
		});
		m.add("Road segment length", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:150 | Max:250 ]");
				int in = sc.nextInt();
				if(in < 150 || in > 250)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setRoadLength(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}
			}
		});
		m.add("Car maximum velocity", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:1 | Max:5 ]");
				int in = sc.nextInt();
				if(in < 1 || in > 5)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setMaxVelocity(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}
			}
		});
		m.add("Car stop distance", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:5 | Max:10 ]");
				int in = sc.nextInt();
				if(in < 5 || in > 10)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setIntersectionsStopDistance(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}
			}
		});
		m.add("Car brake distance", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:20 | Max:30 ]");
				int in = sc.nextInt();
				if(in < 20 || in > 30)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setDistanceBetweenCars(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}	
			}
		});
		m.add("Traffic light green time", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:100 | Max:120 ]");
				int in = sc.nextInt();
				if(in < 100 || in > 120)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setGreenTime(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}	
			}
		});
		m.add("Traffic light yellow time", new UIMenuAction() {
			public void run() {
				System.out.println("Please enter a value between [ Min:120 | Max:140 ]");
				int in = sc.nextInt();
				if(in < 120 || in > 140)
				{
					System.out.println(">> ERROR!! Please enter a valid value << \n");
				}
				else
				{
					p.setYellowTime(in);
					System.out.println(">> New value ["+in+"] received << \n");
				}	
			}
		});
		
		m.add("Reset simulation and return to the main menu",
				new UIMenuAction() {
			public void run() {
				_state = START;
			}
		});

		_menus[stateNum] = m.toUIMenu("Settings Menu");

	}

	private void addEXIT(int stateNum) {
		UIMenuBuilder m = new UIMenuBuilder();

		m.add("Default", new UIMenuAction() {
			public void run() {
			}
		});
		m.add("Yes", new UIMenuAction() {
			public void run() {
				_state = EXITED;
			}
		});
		m.add("No", new UIMenuAction() {
			public void run() {
				_state = START;
			}
		});

		_menus[stateNum] = m.toUIMenu("Are you sure you want to exit?");
	}
}
