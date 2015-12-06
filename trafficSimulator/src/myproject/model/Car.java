package myproject.model;

/**
 * A car remembers its position from the beginning of its road.
 * Cars have random velocity and random movement pattern:
 * when reaching the end of a road, the dot either resets its position
 * to the beginning of the road, or reverses its direction.
 */
public class Car implements Agent {
	Car() { } // Created only by this package

	//private boolean backAndForth = Math.round(Math.random())==1 ? true : false;
	 double position = 0;
	 double velocity = (int) Math.ceil(Math.random() * Property.getProperty().getMaxVelocity());
	 double velocityCopy = velocity;
	 java.awt.Color color = new java.awt.Color((int)Math.ceil(Math.random()*255),(int)Math.ceil(Math.random()*255),(int)Math.ceil(Math.random()*255));
     int currentRoadNS;
     int currentRoadEW;
     int distanceBetweenCars = Property.getProperty().getDistanceBetweenCars(); //was 20
     int distanceBetweenCarsCondition = Property.getProperty().getDistanceBetweenCarsCondition();  //was 30 // must be larger than distanceBetweenCars
     int sinkDistance = distanceBetweenCarsCondition ;
     int transitionDistance = 1;             // was 15
     int intersectionsStopDistance = Property.getProperty().getIntersectionsStopDistance();     // was 25   // must be larger that transitionDistance
     int magicDistance = 10;
     int carsLimit = Property.getProperty().getNumberOfCars();
     int carsGeneratorRespawnTime = Property.getProperty().getCarsGeneratorDelayTime();
     CarController carController;
	public double getPosition() {
		return position;
	}
	public java.awt.Color getColor() {
		return color;
	}
	
	
	public void run(double time) {

		carController = new CarController(this, time);
		carController.execute();
		
	}	
}
