class Speaker{
    static boolean isConnected;
	static int minVolume=0;
	static int currentVolume;
	static int maxVolume=5;
	
	public static boolean onOrOff(){
	    if(isConnected ==false){
		   isConnected=true;
		   System.out.println("The speaker is turned on");
		}
		else if(isConnected ==true){
		   isConnected =false;
		   System.out.println("The speaker is turned off");
		  }
		  return isConnected;
		}
		
    public static void increaseVolume(){
		if(isConnected==true){
			if(currentVolume<maxVolume){
				currentVolume++;
				System.out.println("the Current volume is "+currentVolume);
			}
			else{
				System.out.println("Max volume reached");
			}
		   }
			else{
				System.out.println("Turn on the speaker");
			}
	}
	public static void decreaseVolume(){
		if(isConnected==true){
			if(currentVolume>minVolume){
				currentVolume--;
				System.out.println("Current volume is "+currentVolume);
			}
			else{
				System.out.println("Min Volume reached");
			}
		}
		else{
			System.out.println("Turn on the Speaker");
		}
	}
}
     
		
	