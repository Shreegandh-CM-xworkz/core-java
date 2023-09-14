class Interiors{

     String interiors [] = new String [10];
	 int i;
	 
	 public boolean addInteriors(String interior){
	       boolean isAdded = false;
		   if(i<interiors.length){
		   if(interior != null){
		      interiors[i]=interior;
			  i++;
			  isAdded = true;
		   }
		   }else{System.out.println("Full....");}
		   return isAdded;
	 
	 }
	 
	 public void getDetails(){
	       System.out.println("The Designs contains the items : ");
	     for(i = 0; i < interiors.length ; i++){
		 System.out.println(interiors[i]+ " is added to the desigining");
	 
	 }


}
}