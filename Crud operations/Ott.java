class Ott{

     String movienames [] = new String [4];
	 int index ;
	 
	 public boolean addMovies(String moviename){
            boolean isAdded = false;
            if(moviename != null){
			   movienames[index]=moviename;
			   index++;
			   isAdded = true;
			}
             return isAdded;			
	 
	 }
	 
	 
	 public void getMovieNames(){
		 System.out.println("List of the movies are :");
	    for(index = 0 ; index < movienames.length ; index++)
	       System.out.println(movienames[index]);
	 }
}