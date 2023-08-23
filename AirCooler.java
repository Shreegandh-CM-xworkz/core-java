class AirCooler{
    static boolean isConnected;
	static  int minTemperature=0;
	static int maxTemperature=100;
	static int currentTemperature;
	  
	  public static boolean onOff(){
		
	    if(isConnected ==false){
		   isConnected=true;
		   System.out.println("The AirCooler is turned on");
		}
		else if(isConnected ==true){
		   isConnected =false;
		   System.out.println("The AirCooleris turned off");
		  }
		  return isConnected;
		}
		
    public static void increaseTemperature(){
		if(isConnected==true){
			if(currentTemperature<maxTemperature){
				currentTemperature++;
				System.out.println("the Current Temperature is "+currentTemperature);
			}
			else{
				System.out.println("Max Temperature reached");
			}
		   }
			else{
				System.out.println("Turn on the AC");
			}
	}
	public static void decreaseTemperature(){
		if(isConnected==true){
			if(currentTemperature>minTemperature){
				currentTemperature--;
				System.out.println("Current Temperature is "+currentTemperature);
			}
			else{
				System.out.println("Min Temperature reached");
			}
		}
		else{
			System.out.println("Turn on the AC");
		}
	}
}