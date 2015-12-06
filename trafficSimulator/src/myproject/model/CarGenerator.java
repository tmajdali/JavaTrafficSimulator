package myproject.model;

public class CarGenerator {
	
	private static CarGenerator cg = new CarGenerator();
	
	private CarGenerator(){}
	
	public static CarGenerator getInstance()
	{
		return cg;
	}
	
	public void execute(Car controlledCar,Double time)
	{
		  if(time%controlledCar.carsGeneratorRespawnTime==0)//&& RoadNSFactory.getRoadNS02Cars().size() <1 && RoadNSFactory.getRoadNS01Cars().size() <1 )
	      {
	    	  if(!Model.stack.empty())
	    	  {
	    		  if( RoadNSFactory.getRoadNS01Cars().size() < controlledCar.carsLimit){
	    		  Model.stack.peek().position=0;
	    		  RoadNSFactory.roadNS01.accept(Model.stack.pop());
	    		  }
	    		  if( RoadNSFactory.getRoadNS06Cars().size() < controlledCar.carsLimit){
		    		  Model.stack.peek().position=0;
		    		  RoadNSFactory.roadNS06.accept(Model.stack.pop());
		    		  }
	    		  if( RoadNSFactory.getRoadNS07Cars().size() < controlledCar.carsLimit){
		    		  Model.stack.peek().position=0;
		    		  RoadNSFactory.roadNS07.accept(Model.stack.pop());
		    		  }
	    		  if( RoadEWFactory.getRoadEW01Cars().size() < controlledCar.carsLimit){
		    		  Model.stack.peek().position=0;
		    		  RoadEWFactory.roadEW01.accept(Model.stack.pop());
		    		  }
	    		  if( RoadEWFactory.getRoadEW08Cars().size() < controlledCar.carsLimit){
		    		  Model.stack.peek().position=0;
		    		  RoadEWFactory.roadEW08.accept(Model.stack.pop());
		    		  }
	    	  }
	      }
	}

}
