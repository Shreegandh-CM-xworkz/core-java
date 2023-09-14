class Cricket{

     String playerNames[] = new String [11];
	 int index;
	 
	 public boolean addPlayers(String playerName){
	        boolean isAdded = false;
			if(index<playerNames.length){
			if( playerName != null){
			   playerNames[index] = playerName;
			   index++;
			   
			}
		}else{System.out.println("Storage is full");}
			return isAdded;
	    
	 }
	 
	 public void getDetails(){
	 System.out.println("The Players in the team are : ");
	     for(index = 0; index < playerNames.length ; index++){
		 System.out.println(playerNames[index]+ " is in the Team");
		 
	 }
	 
	 }
}