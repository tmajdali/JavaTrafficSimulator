package myproject.model;

import java.util.ArrayList;
import java.util.List;

public class RoadNSFactory {
	static List<Road> fullRoadsNS = new ArrayList<Road>();
	static Road roadNS01 = new Road();
	static Road roadNS02 = new Road();
	static Road roadNS03 = new Road();
	static Road roadNS04 = new Road();
	static Road roadNS05 = new Road();
	static Road roadNS06 = new Road();
	static Road roadNS07 = new Road();
	static Road roadNS08 = new Road();
	static Road roadNS09 = new Road();
	
	static void setFullRoadsNSList()
	{
		fullRoadsNS.add(roadNS01);
		fullRoadsNS.add(roadNS02);
		fullRoadsNS.add(roadNS03);
		fullRoadsNS.add(roadNS04);
		fullRoadsNS.add(roadNS05);
		fullRoadsNS.add(roadNS06);
		fullRoadsNS.add(roadNS07);
		fullRoadsNS.add(roadNS08);
		fullRoadsNS.add(roadNS09);
	}
	
			
	public static List<Road> getRoads()
	{
		return fullRoadsNS;
	}
	public static List<Car> getRoadNS01Cars()
	{
		return roadNS01.getCars();
	}
	public static List<Car> getRoadNS02Cars()
	{
		return roadNS02.getCars();
	}
	public static List<Car> getRoadNS03Cars()
	{
		return roadNS03.getCars();
	}
	public static List<Car> getRoadNS04Cars()
	{
		return roadNS04.getCars();
	}
	public static List<Car> getRoadNS05Cars()
	{
		return roadNS05.getCars();
	}
	public static List<Car> getRoadNS06Cars()
	{
		return roadNS06.getCars();
	}
	public static List<Car> getRoadNS07Cars()
	{
		return roadNS07.getCars();
	}
	public static List<Car> getRoadNS08Cars()
	{
		return roadNS08.getCars();
	}
	public static List<Car> getRoadNS09Cars()
	{
		return roadNS09.getCars();
	}

}
