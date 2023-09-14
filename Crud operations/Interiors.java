class Interiors{

     String interiors [] = new String [10];
	 int i;
	 
	 public boolean addInteriors(String interior){
	       boolean isAdded = false;
		   if(interior != null){
		      interiors[i]=interior;
			  i++;
			  isAdded = true;
		   }return isAdded;
	 
	 }
	 
	 public void getDetails(){
	       System.out.println("The Designs contains the items : ");
	     for(i = 0; i < interiors.length ; i++){
		 System.out.println(interiors[i]+ " is added to the desigining");
	 
	 }


}
}