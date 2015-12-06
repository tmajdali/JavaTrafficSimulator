package myproject.main;

import myproject.main.Control;
import myproject.ui.UI;
import myproject.model.Model;
import myproject.model.Property;
import myproject.model.swing.SwingAnimatorBuilder;
import myproject.model.text.TextAnimatorBuilder;

/**
 * A static class to demonstrate the visualization aspect of
 * simulation.
 */
public class Main {
	private Main() {}
	public static void main(String[] args) {
		

		UI ui = null;
		ui = new myproject.ui.TextUI();
		Control control = new Control( ui);
		control.run();
	}
}

