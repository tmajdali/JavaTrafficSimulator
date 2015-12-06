package myproject.model;

public class CarController {
	Car controlledCar;
	Double time;
	CarController(Car car,Double time)
	{
		this.controlledCar = car;
		this.time = time;
	}
	
	void execute()
	{
		//=====================================================================	
				// break demo  NS
		for(Car car : RoadNSFactory.getRoadNS01Cars())
		{
			if((RoadNSFactory.getRoadNS01Cars().contains(controlledCar)) & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS02Cars())
		{
			if(controlledCar.currentRoadNS == 2 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS03Cars())
		{
			if(controlledCar.currentRoadNS == 3 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS06Cars())
		{
			if((RoadNSFactory.getRoadNS06Cars().contains(controlledCar)) & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS05Cars())
		{
			if(controlledCar.currentRoadNS == 5 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS04Cars())
		{
			if(controlledCar.currentRoadNS == 4 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS07Cars())
		{
			if((RoadNSFactory.getRoadNS07Cars().contains(controlledCar)) & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS08Cars())
		{
			if(controlledCar.currentRoadNS == 8 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadNSFactory.getRoadNS09Cars())
		{
			if(controlledCar.currentRoadNS == 9 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
//=========================================================================
		// break demo  EW
		for(Car car : RoadEWFactory.getRoadEW01Cars())
		{
			if((RoadEWFactory.getRoadEW01Cars().contains(controlledCar)) & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadEWFactory.getRoadEW02Cars())
		{
			if(controlledCar.currentRoadEW == 2 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadEWFactory.getRoadEW03Cars())
		{
			if(controlledCar.currentRoadEW == 3 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadEWFactory.getRoadEW04Cars())
		{
			if(controlledCar.currentRoadEW == 4 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadEWFactory.getRoadEW08Cars())
		{
			if((RoadEWFactory.getRoadEW08Cars().contains(controlledCar)) & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadEWFactory.getRoadEW07Cars())
		{
			if(controlledCar.currentRoadEW == 7 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadEWFactory.getRoadEW06Cars())
		{
			if(controlledCar.currentRoadEW == 6 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
		for(Car car : RoadEWFactory.getRoadEW05Cars())
		{
			if(controlledCar.currentRoadEW == 5 & ((controlledCar.position - car.position) <= controlledCar.distanceBetweenCarsCondition) & ((controlledCar.position - car.position) > controlledCar.magicDistance))
			{
				//controlledCar.position = car.position+50;
				car.position = controlledCar.position - controlledCar.distanceBetweenCars;
				//car.velocity = 0;
				car.velocity = controlledCar.velocity/2;
			}
			else
			{
				controlledCar.velocity= controlledCar.velocityCopy ;
			}
		}
		
//==========================================================================
//==========================================================================
		// Cars generator
		CarGenerator.getInstance().execute(controlledCar, time);
		   
//=======================================================================		     
		     if(RoadNSFactory.getRoadNS01Cars().contains(controlledCar))
			{
				if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
				{
					
					
						
					
					RoadNSFactory.roadNS02.accept(controlledCar);
					RoadNSFactory.getRoadNS01Cars().remove(controlledCar);
					//RoadNSFactory.getRoadNS01Cars().remove(controlledCar);
					
					controlledCar.position=0;
					controlledCar.currentRoadNS=2;
					
				}
				

			}
//------------------------------------------------		
		     // control cars in intersections01-light01-
		     if(((RoadNSFactory.getRoadNS01Cars().contains(controlledCar)) 
		    		 && (LightFactory.light01.state.equals("red")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		     else if (((RoadEWFactory.getRoadEW01Cars().contains(controlledCar)) 
		    		 && (LightFactory.light01.state.equals("green") || LightFactory.light01.state.equals("yellow") )
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		   //=====================================================
		   //-----------------------------------------------------
		   		     //control cars in intersections02-light02-		   
		     else if(((RoadNSFactory.getRoadNS05Cars().contains(controlledCar)) 
		    		 && (LightFactory.light02.state.equals("red")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		     else if (((RoadEWFactory.getRoadEW02Cars().contains(controlledCar)) 
		    		 && (LightFactory.light02.state.equals("green") || LightFactory.light01.state.equals("yellow")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }

		     
//==========================================================
//---------------------------------------------------------
		     //control cars in intersections03-light03-
	        else if(((RoadNSFactory.getRoadNS07Cars().contains(controlledCar)) 
		    		 && (LightFactory.light03.state.equals("red")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		     else if (((RoadEWFactory.getRoadEW03Cars().contains(controlledCar)) 
		    		 && (LightFactory.light03.state.equals("green") || LightFactory.light01.state.equals("yellow")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
//=================================================================================
//--------------------------------------------------------------------------------
		     //control cars in intersections04-light04-
		     else if(((RoadNSFactory.getRoadNS02Cars().contains(controlledCar)) 
		    		 && (LightFactory.light04.state.equals("red")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		     else if (((RoadEWFactory.getRoadEW06Cars().contains(controlledCar)) 
		    		 && (LightFactory.light04.state.equals("green") || LightFactory.light01.state.equals("yellow")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
//==============================================================================
//----------------------------------------------------------------------------
		     //control cars in intersections05-light05-
		     else if(((RoadNSFactory.getRoadNS06Cars().contains(controlledCar)) 
		    		 && (LightFactory.light05.state.equals("red")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		     else if (((RoadEWFactory.getRoadEW07Cars().contains(controlledCar)) 
		    		 && (LightFactory.light05.state.equals("green") || LightFactory.light01.state.equals("yellow")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
//================================================================================
//-------------------------------------------------------------------------------
		   //control cars in intersections06-light06-
		     else if(((RoadNSFactory.getRoadNS08Cars().contains(controlledCar)) 
		    		 && (LightFactory.light06.state.equals("red")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		     else if (((RoadEWFactory.getRoadEW08Cars().contains(controlledCar)) 
		    		 && (LightFactory.light06.state.equals("green") || LightFactory.light01.state.equals("yellow")) 
		    		 &&((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.intersectionsStopDistance))))
		     {
		    	 controlledCar.velocity=0;
		     }
		     
//=============================================================================		     
		     else{
		    	 controlledCar.velocity= controlledCar.velocityCopy ;
		     }
//=============================================================================
		
		if(controlledCar.currentRoadNS==2)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadNSFactory.getRoadNS02Cars().contains(controlledCar))
				{
					RoadNSFactory.roadNS03.accept(controlledCar);	
					RoadNSFactory.getRoadNS02Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadNS=3;
				
			}  
		}

		if(controlledCar.currentRoadNS==3)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.sinkDistance))
			{

				while(RoadNSFactory.getRoadNS03Cars().contains(controlledCar))	
				{
					RoadNSFactory.getRoadNS03Cars().remove(controlledCar);
				}

			}
		}
		if(RoadNSFactory.getRoadNS06Cars().contains(controlledCar))
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadNSFactory.getRoadNS06Cars().contains(controlledCar))
				{
					RoadNSFactory.roadNS05.accept(controlledCar);	
					RoadNSFactory.getRoadNS06Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadNS=5;
				
			}  
		}
		if(controlledCar.currentRoadNS==5)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength())) // need fix
			{

				while(RoadNSFactory.getRoadNS05Cars().contains(controlledCar))
				{
					RoadNSFactory.roadNS04.accept(controlledCar);	
					RoadNSFactory.getRoadNS05Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadNS=4;
				
			}  
		}
		if(controlledCar.currentRoadNS==4)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.sinkDistance))
			{

				while(RoadNSFactory.getRoadNS04Cars().contains(controlledCar))	
				{
					RoadNSFactory.getRoadNS04Cars().remove(controlledCar);
				}

			}
		}
		if(RoadNSFactory.getRoadNS07Cars().contains(controlledCar))
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadNSFactory.getRoadNS07Cars().contains(controlledCar))
				{
					RoadNSFactory.roadNS08.accept(controlledCar);	
					RoadNSFactory.getRoadNS07Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadNS=8;
				
			}  
		}
		if(controlledCar.currentRoadNS==8)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadNSFactory.getRoadNS08Cars().contains(controlledCar))
				{
					RoadNSFactory.roadNS09.accept(controlledCar);	
					RoadNSFactory.getRoadNS08Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadNS=9;
				
			}  
		}
		if(controlledCar.currentRoadNS==9)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.sinkDistance))
			{

				while(RoadNSFactory.getRoadNS09Cars().contains(controlledCar))	
				{
					RoadNSFactory.getRoadNS09Cars().remove(controlledCar);
				}

			}
		}
         //=========================================================================
		if(RoadEWFactory.getRoadEW01Cars().contains(controlledCar))
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadEWFactory.getRoadEW01Cars().contains(controlledCar))
				{
					RoadEWFactory.roadEW02.accept(controlledCar);	
					RoadEWFactory.getRoadEW01Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadEW=2;
				
			}  
		}
		if(controlledCar.currentRoadEW==2)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadEWFactory.getRoadEW02Cars().contains(controlledCar))
				{
					RoadEWFactory.roadEW03.accept(controlledCar);	
					RoadEWFactory.getRoadEW02Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadEW=3;
				
			}  
		}
		if(controlledCar.currentRoadEW==3)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadEWFactory.getRoadEW03Cars().contains(controlledCar))
				{
					RoadEWFactory.roadEW04.accept(controlledCar);	
					RoadEWFactory.getRoadEW03Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadEW=4;
				
			}  
		}
		if(controlledCar.currentRoadEW==4)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.sinkDistance))
			{

				while(RoadEWFactory.getRoadEW04Cars().contains(controlledCar))	
				{
					RoadEWFactory.getRoadEW04Cars().remove(controlledCar);
				}

			}
		}
		if(RoadEWFactory.getRoadEW08Cars().contains(controlledCar))
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadEWFactory.getRoadEW08Cars().contains(controlledCar))
				{
					RoadEWFactory.roadEW07.accept(controlledCar);	
					RoadEWFactory.getRoadEW08Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadEW=7;
				
			}  
		}
		if(controlledCar.currentRoadEW==7)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadEWFactory.getRoadEW07Cars().contains(controlledCar))
				{
					RoadEWFactory.roadEW06.accept(controlledCar);	
					RoadEWFactory.getRoadEW07Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadEW=6;
				
			}  
		}
		if(controlledCar.currentRoadEW==6)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.transitionDistance))
			{

				while(RoadEWFactory.getRoadEW06Cars().contains(controlledCar))
				{
					RoadEWFactory.roadEW05.accept(controlledCar);	
					RoadEWFactory.getRoadEW06Cars().remove(controlledCar);
				}

				controlledCar.position=0;
				controlledCar.currentRoadEW=5;
				
			}  
		}
		if(controlledCar.currentRoadEW==5)
		{
			if ((controlledCar.position + controlledCar.velocity) > (Property.getProperty().getRoadLength()-Property.getProperty().getCarLength()-controlledCar.sinkDistance))
			{

				while(RoadEWFactory.getRoadEW05Cars().contains(controlledCar))	
				{
					RoadEWFactory.getRoadEW05Cars().remove(controlledCar);
				}

			}
		}
		
		controlledCar.position += controlledCar.velocity;
	}
	

}
