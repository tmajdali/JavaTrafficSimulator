package myproject.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Stack;

import myproject.util.Animator;

/**
 * An example to model for a simple visualization.
 * The model contains roads organized in a matrix.
 * See {@link #Model(AnimatorBuilder, int, int)}.
 */
public class Model extends Observable {
	private List<Agent> agents;
	private Animator animator;
	private boolean disposed;
	private double time;
	private int rows = 2;
	private int columns = 3;
	public static Stack<Car> stack = new Stack<Car>();

	/** Creates a model to be visualized using the <code>builder</code>.
	 *  If the builder is null, no visualization is performed.
	 *  The number of <code>rows</code> and <code>columns</code>
	 *  indicate the number of {@link Light}s, organized as a 2D
	 *  matrix.  These are separated and surrounded by horizontal and
	 *  vertical {@link Road}s.  For example, calling the constructor with 1
	 *  row and 2 columns generates a model of the form:
	 *  <pre>
	 *     |  |
	 *   --@--@--
	 *     |  |
	 *  </pre>
	 *  where <code>@</code> is a {@link Light}, <code>|</code> is a
	 *  vertical {@link Road} and <code>--</code> is a horizontal {@link Road}.
	 *  Each road has one {@link Car}.
	 *
	 *  <p>
	 *  The {@link AnimatorBuilder} is used to set up an {@link
	 *  Animator}.
	 *  {@link AnimatorBuilder#getAnimator()} is registered as
	 *  an observer of this model.
	 *  <p>
	 */
	public Model(AnimatorBuilder builder) {
		if (rows < 0 || columns < 0 || (rows == 0 && columns == 0)) {
			throw new IllegalArgumentException();
		}
		if (builder == null) {
			builder = new NullAnimatorBuilder();
		}
		this.agents = new ArrayList<Agent>();
		setup(builder, rows, columns);
		this.animator = builder.getAnimator();
		super.addObserver(animator);
	}

	/**
	 * Run the simulation for <code>duration</code> model seconds.
	 */
	public void run(double duration) {
		
		if (disposed)
			throw new IllegalStateException();
		for (int i=0; i<duration; i++) {
			time++;
			// iterate through a copy because agents may change during iteration...
			for (Agent a : agents.toArray(new Agent[0])) {
				a.run(time);
			}
			super.setChanged();
			super.notifyObservers();
		}
	}

	/**
	 * Throw away this model.
	 */
	public void dispose() {
		animator.dispose();
		disposed = true;
	}

	/**
	 * Construct the model, establishing correspondences with the visualizer.
	 */
	private void setup(AnimatorBuilder builder, int rows, int columns) {
		List<Road> roads = new ArrayList<Road>();
		Light[][] intersections = new Light[rows][columns];

		// Add LightFactory
		int lc=0;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				lc++;
				switch(lc)
				{
				case 1:
				{
				intersections[i][j] = LightFactory.light01;
				builder.addLight(intersections[i][j], i, j);
				agents.add(intersections[i][j]);
				break;
				}
				case 2:
				{
				intersections[i][j] = LightFactory.light02;
				builder.addLight(intersections[i][j], i, j);
				agents.add(intersections[i][j]);
				break;
				}
				case 3:
				{
				intersections[i][j] = LightFactory.light03;
				builder.addLight(intersections[i][j], i, j);
				agents.add(intersections[i][j]);
				break;
				}
				case 4:
				{
				intersections[i][j] = LightFactory.light04;
				builder.addLight(intersections[i][j], i, j);
				agents.add(intersections[i][j]);
				break;
				}
				case 5:
				{
				intersections[i][j] = LightFactory.light05;
				builder.addLight(intersections[i][j], i, j);
				agents.add(intersections[i][j]);
				break;
				}
				case 6:
				{
				intersections[i][j] = LightFactory.light06;
				builder.addLight(intersections[i][j], i, j);
				agents.add(intersections[i][j]);
				break;
				}
				
				}
			}
		}

		// Add Horizontal Roads
		int k =0;
		boolean eastToWest = false;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<=columns; j++) {
				k++;
				switch(k){
				case 1:
				{
				builder.addHorizontalRoad(RoadEWFactory.roadEW01, i, j, eastToWest);
				    roads.add(RoadEWFactory.roadEW01);
				break;
				}
				case 2: 
				{
					builder.addHorizontalRoad(RoadEWFactory.roadEW02, i, j, eastToWest);
					//roads.add(RoadNSFactory.roadNS02);
					break;
				}
				case 3: 
				{
					builder.addHorizontalRoad(RoadEWFactory.roadEW03, i, j, eastToWest);
					//roads.add(RoadNSFactory.roadNS03);
					//c=0;
					break;
				}
				case 4:
				{
					builder.addHorizontalRoad(RoadEWFactory.roadEW04, i, j, eastToWest);
					//roads.add(RoadNSFactory.roadNS04);
					break;
				}
				case 5:
				{
					builder.addHorizontalRoad(RoadEWFactory.roadEW05, i, j, eastToWest);
					//roads.add(RoadNSFactory.roadNS05);
					break;
				}
				case 6:
				{
					builder.addHorizontalRoad(RoadEWFactory.roadEW06, i, j, eastToWest);
					//roads.add(RoadEWFactory.roadEW06);
					//c=0;
					break;
				}
				case 7:
				{
					builder.addHorizontalRoad(RoadEWFactory.roadEW07, i, j, eastToWest);
					//roads.add(RoadNSFactory.roadNS05);
					break;
				}
				case 8:
				{
					builder.addHorizontalRoad(RoadEWFactory.roadEW08, i, j, eastToWest);
					roads.add(RoadEWFactory.roadEW08);
					//c=0;
					break;
				}
				}
				
			}
			eastToWest = !eastToWest;
		}

		// Add Vertical Roads
		boolean southToNorth = false;
		RoadNSFactory.setFullRoadsNSList();
		int c=0;
		
		for (int j=0; j<columns; j++) {
			
			for (int i=0; i<=rows; i++) {
				//k++;
				c++;
				
				/*for (int j=0; j<columns; j++) {
					for (int i=0; i<=rows; i++) {
						for(Road road : RoadNSFactory.getRoads())
						{
						builder.addVerticalRoad(road, i, j, southToNorth);
						roads.add(road);
						}
					}
					southToNorth = !southToNorth;
				}*/
				switch(c){
				case 1:
				{
				builder.addVerticalRoad(RoadNSFactory.roadNS01, i, j, southToNorth);
				    roads.add(RoadNSFactory.roadNS01);
				break;
				}
				case 2: 
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS02, i, j, southToNorth);
					//roads.add(RoadNSFactory.roadNS02);
					break;
				}
				case 3: 
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS03, i, j, southToNorth);
					//roads.add(RoadNSFactory.roadNS03);
					//c=0;
					break;
				}
				case 4:
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS04, i, j, southToNorth);
					//roads.add(RoadNSFactory.roadNS04);
					break;
				}
				case 5:
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS05, i, j, southToNorth);
					//roads.add(RoadNSFactory.roadNS05);
					break;
				}
				case 6:
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS06, i, j, southToNorth);
					roads.add(RoadNSFactory.roadNS06);
					//c=0;
					break;
				}
				case 7:
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS07, i, j, southToNorth);
					roads.add(RoadNSFactory.roadNS07);
					break;
				}
				case 8:
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS08, i, j, southToNorth);
					//roads.add(RoadNSFactory.roadNS08);
					break;
				}
				case 9:
				{
					builder.addVerticalRoad(RoadNSFactory.roadNS09, i, j, southToNorth);
					//roads.add(RoadNSFactory.roadNS09);
					//c=0;
					break;
				}
				}
				
				
			}
			southToNorth = !southToNorth;
		}

		// Add Cars
		for (Road l : roads) {
			Car car = new Car();
			
			agents.add(car);
			
			l.accept(car);
			
		}
		for (Road l : roads) {
			
			for (int i = 0 ; i < 200 ; i++)
			{
			Car car = new Car();
			agents.add(car);
			stack.add(car);
			}
			
			
			
		}
		
		/*Car car02 = new Car();
		agents.add(car02);
		stack.add(car02);*/
	}
}
