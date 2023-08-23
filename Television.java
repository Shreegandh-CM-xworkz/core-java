class Television{
    static boolean isConnected;
	static  int minBrightness=0;
	static int maxBrightness=10;
	static int currentBrightness;
	  
	  public static boolean onOff(){
		
	    if(isConnected ==false){
		   isConnected=true;
		   System.out.println(" Television is turned on");
		}
		else if(isConnected ==true){
		   isConnected =false;
		   System.out.println(" Television is turned off");
		  }
		  return isConnected;
		}
		
    public static void increaseBrightness(){
		if(isConnected==true){
			if(currentBrightness<maxBrightness){
				currentBrightness++;
				System.out.println("Current Brightness is "+currentBrightness);
			}
			else{
				System.out.println("Max Brightness reached");
			}
		   }
			else{
				System.out.println("Turn on the Television");
			}
	}
	public static void decreaseBrightness(){
		if(isConnected==true){
			if(currentBrightness>minBrightness){
				currentBrightness--;
				System.out.println("Current Brightness is "+currentBrightness);
			}
			else{
				System.out.println("Min Brightness reached");
			}
		}
		else{
			System.out.println("Turn on the Television");
		}
	}
}