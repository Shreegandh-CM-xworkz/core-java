class Spotify{

     String songNames[] = new String [10];
	 int index;
	 
	 public boolean addSongs(String songName){
	        boolean isAdded = false;
			if( songName != null){
			   songNames[index] = songName;
			   index++;
			   
			}
			return isAdded;
	    
	 }
	 
	 public void getDetails(){
	 System.out.println("The Songs in the list are : ");
	     for(index = 0; index < songNames.length ; index++){
		 System.out.println(songNames[index]+ " is added to the playlist");
		 
	 }
	 
	 }
}