package myproject.model;



public class Property {
	
	static private double time = 800;
	static private int carsGeneratorDelayTime = 155;
	static private int numberOfCars = 3;//2
	static private double maxVelocity = 3;//5
	static private int distanceBetweenCars = 20;
	static private int distanceBetweenCarsCondition = distanceBetweenCars+10;
	static private int  intersectionsStopDistance = 5;
	static private int greenTime = 112;
	static private int yellowTime = 133;
	static private double roadLength = 200;
	static private double carLength = 10;  // just get
	static Property property = new Property();
	
	public static Property getProperty()
	{
		return property;
	}
//-------------------------------------------------	
	public void setTime(double time)
	{
		this.time = time;
	}
	public double getTime()
	{
		return time;
	}
	//-----------------------------------------
	public void setCarsGeneratorDelayTime(int rate)
	{
		this.carsGeneratorDelayTime = rate;
	}
	public int getCarsGeneratorDelayTime()
	{
		return carsGeneratorDelayTime;
	}
	//---------------------------------------
	public void setMaxVelocity(double rate)
	{
		this.maxVelocity = rate;
	}
	public double getMaxVelocity()
	{
		return maxVelocity;
	}
	//------------------------------------
	public void setDistanceBetweenCars(int rate)
	{
		this.distanceBetweenCars = rate;
	}
	public int getDistanceBetweenCars()
	{
		return distanceBetweenCars;
	}
	//---------------------------------------
	public int getDistanceBetweenCarsCondition()
	{
		return distanceBetweenCarsCondition;
	}
	//----------------------------------------
	public void setIntersectionsStopDistance(int rate)
	{
		this.intersectionsStopDistance = rate;
	}
	public int getIntersectionsStopDistance()
	{
		return intersectionsStopDistance;
	}
	//---------------------------------------
	public void setGreenTime(int rate)
	{
		this.greenTime = rate;
	}
	public int getGreenTime()
	{
		return greenTime;
	}
	//---------------------------------------
	public void setYellowTime(int rate)
	{
		this.yellowTime = rate;
	}
	public int getYellowTime()
	{
		return yellowTime;
	}
	//---------------------------------------
	public void setNumberOfCars(int rate)
	{
		this.numberOfCars = rate;
	}
	public int getNumberOfCars()
	{
		return numberOfCars;
	}
	//---------------------------------------
	public void setRoadLength(double rate)
	{
		this.roadLength = rate;
	}
	public double getRoadLength()
	{
		return roadLength;
	}
	//---------------------------------------
	public double getCarLength()
	{
		return carLength;
	}
	//---------------------------------------
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("Simulation time step (seconds)       [" + this.getTime() + "]\n");
		b.append("Car entry rate (car)                 [" + this.getNumberOfCars() + "]\n");
		b.append("Cars-generator delay time (seconds)  [" + this.getCarsGeneratorDelayTime() + "]\n");
		b.append("Road segment length (meters)         [" + this.getRoadLength() + "]\n");
		b.append("Car length (meters)                  [" + this.getCarLength() + "]\n");
		b.append("Car maximum velocity (meters/second) [" + this.getMaxVelocity() + "]\n");
		b.append("Car stop distance (meters)           [" + this.getIntersectionsStopDistance() + "]\n");
		b.append("Car brake distance (meters)          [" + this.getDistanceBetweenCars() + "]\n");
		b.append("Traffic light green time (seconds)   [" + this.getGreenTime() + "]\n");
		b.append("Traffic light yellow time (seconds)  [" + this.getYellowTime() + "]\n");
		return b.toString();
	}

}
