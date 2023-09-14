class Spotify{

     String songNames[] = new String [10];
	 int index;
	 
	 public boolean addSongs(String songName){
	        boolean isAdded = false;
			
			if(index<songNames.length){
			 boolean exists =duplicateValue(songName);
			 if(exists==false){
			 if( songName != null){
			   songNames[index] = songName;
			   index++;
			   }else{System.out.println("Null values are not allowed");}
			}//else{System.out.println("Value is already present");}
			}
			else{System.out.println("List is full...");}
			return isAdded;
	     }
	 
	 public void getDetails(){
	 System.out.println("The Songs in the list are : ");
	     for(index = 0; index < songNames.length ; index++){
		 System.out.println(songNames[index]+ " is added to the playlist");
		}
		
	   
	 }
	 public boolean duplicateValue(String songName){
		 boolean exists=false;
		 for( String value:songNames){

			 if(songName == value){
				 System.out.println("The Value is already present");
				 exists=true;
			 }
		 }
		 return exists;
	 }
}