class Cricket{

     String playerNames[] = new String [11];
	 int index;
	 
	 public boolean addPlayers(String playerName){
	        boolean isAdded = false;
			if( playerName != null){
			   playerNames[index] = playerName;
			   index++;
			   
			}
			return isAdded;
	    
	 }
	 
	 public void getDetails(){
	 System.out.println("The Players in the team are : ");
	     for(index = 0; index < playerNames.length ; index++){
		 System.out.println(playerNames[index]+ " is in the Team");
		 
	 }
	 
	 }
}