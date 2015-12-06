package myproject.model;

import java.util.ArrayList;
import java.util.List;

public class RoadEWFactory {
	static List<Road> fullRoadsEW = new ArrayList<Road>();
	static Road roadEW01 = new Road();
	static Road roadEW02 = new Road();
	static Road roadEW03 = new Road();
	static Road roadEW04 = new Road();
	static Road roadEW05 = new Road();
	static Road roadEW06 = new Road();
	static Road roadEW07 = new Road();
	static Road roadEW08 = new Road();
	
	static void setFullRoadsNSList()
	{
		fullRoadsEW.add(roadEW01);
		fullRoadsEW.add(roadEW02);
		fullRoadsEW.add(roadEW03);
		fullRoadsEW.add(roadEW04);
		fullRoadsEW.add(roadEW05);
		fullRoadsEW.add(roadEW06);
		fullRoadsEW.add(roadEW07);
		fullRoadsEW.add(roadEW08);
}
	public static List<Road> getRoads()
	{
		return fullRoadsEW;
	}
	
	
	public static List<Car> getRoadEW01Cars()
	{
		return roadEW01.getCars();
	}
	public static List<Car> getRoadEW02Cars()
	{
		return roadEW02.getCars();
	}
	public static List<Car> getRoadEW03Cars()
	{
		return roadEW03.getCars();
	}
	public static List<Car> getRoadEW04Cars()
	{
		return roadEW04.getCars();
	}
	public static List<Car> getRoadEW05Cars()
	{
		return roadEW05.getCars();
	}
	public static List<Car> getRoadEW06Cars()
	{
		return roadEW06.getCars();
	}
	public static List<Car> getRoadEW07Cars()
	{
		return roadEW07.getCars();
	}
	public static List<Car> getRoadEW08Cars()
	{
		return roadEW08.getCars();
	}
}
