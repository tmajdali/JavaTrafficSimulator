package myproject.model;

import java.util.Random;

public class LightController {
	Double time;
	Random random = new Random();
	private int r = random.nextInt(2 - 1 + 1) + 1;
	private int greenTime = Property.getProperty().getGreenTime();
	private int yellowTime = Property.getProperty().getYellowTime();
	private int redTime = 144;
	LightController(Double time)
	{
		this.time = time;
	}
	void execute()
	{
		switch(r)
		{
		case 1:{
			if (time%greenTime==0) {
				LightFactory.light01.state = "green";
				LightFactory.light04.state = "green";
				LightFactory.light03.state = "green";
				LightFactory.light06.state = "green";
				//-----------------------------------
				LightFactory.light02.state = "red";
				LightFactory.light05.state = "red";
				
			}
			else if(time%yellowTime==0)
			{
				LightFactory.light01.state = "yellow";
				LightFactory.light04.state = "yellow";
				LightFactory.light03.state = "yellow";
				LightFactory.light06.state = "yellow";
				//------------------------------------
				LightFactory.light02.state = "yellow";
				LightFactory.light05.state = "yellow";
				
			}
			else if(time%redTime==0)
			{
				LightFactory.light01.state = "red";
				LightFactory.light04.state = "red";
				LightFactory.light03.state = "red";
				LightFactory.light06.state = "red";
				//------------------------------------
				LightFactory.light02.state = "green";
				LightFactory.light05.state = "green";
			}
			break;
			
		}
		case 2:{
			if (time%greenTime==0) {
				LightFactory.light01.state = "red";
				LightFactory.light04.state = "red";
				LightFactory.light03.state = "red";
				LightFactory.light06.state = "red";
				//-----------------------------------
				LightFactory.light02.state = "green";
				LightFactory.light05.state = "green";
				
			}
			else if(time%yellowTime==0)
			{
				LightFactory.light01.state = "yellow";
				LightFactory.light04.state = "yellow";
				LightFactory.light03.state = "yellow";
				LightFactory.light06.state = "yellow";
				//------------------------------------
				LightFactory.light02.state = "yellow";
				LightFactory.light05.state = "yellow";
				
			}
			else if(time%redTime==0)
			{
				LightFactory.light01.state = "green";
				LightFactory.light04.state = "green";
				LightFactory.light03.state = "green";
				LightFactory.light06.state = "green";
				//------------------------------------
				LightFactory.light02.state = "red";
				LightFactory.light05.state = "red";
			}
			break;
			
		}
		
		
		}
	}

}
