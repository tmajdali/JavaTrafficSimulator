package myproject.model;

import java.util.List;
import java.util.Random;


/**
 * A light has a boolean state.
 */
public class Light implements Agent {
	Light() { } // Created only by this package
	public String state = "green";
	LightController lightControl;
	
    

	public String getState() {
		return state;
	}
	public void run(double time) {
		lightControl = new LightController(time);
		lightControl.execute();
		
		
	}
}

