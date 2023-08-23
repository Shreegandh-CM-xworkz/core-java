class WashingMachine{
    static boolean isConnected;
	static  int minSpeed=1;
	static int maxSpeed=3;
	static int currentSpeed;
	  
	  public static boolean onOff(){
		
	    if(isConnected ==false){
		   isConnected=true;
		   System.out.println(" WashingMachine is turned on");
		}
		else if(isConnected ==true){
		   isConnected =false;
		   System.out.println(" WashingMachine is turned off");
		  }
		  return isConnected;
		}
		
    public static void increaseSpeed(){
		if(isConnected==true){
			if(currentSpeed<maxSpeed){
				currentSpeed++;
				System.out.println("Current Speed is "+currentSpeed);
			}
			else{
				System.out.println("Max Speed reached");
			}
		   }
			else{
				System.out.println("Turn on the WashingMachine");
			}
	}
	public static void decreaseSpeed(){
		if(isConnected==true){
			if(currentSpeed>minSpeed){
				currentSpeed--;
				System.out.println("Current speed is "+currentSpeed);
			}
			else{
				System.out.println("Min speed reached");
			}
		}
		else{
			System.out.println("Turn on the WashingMachine");
		}
	}
}