class AppExecutor{
     public static void main(String [] args){
	   Application app=new Application();
	   Playstore store=new Playstore();
	   
	   store.application=app;
	   
	   store.managedBy="Google";
	   app.setName("Bgmi");
	   app.setSizeInMb(144);
	   app.setVersion("v.14.5");
	   app.setRating("4.5 Star");
	   app.setNumOfDownloads("4M downloads");
	   app.setCompanyName("Krafton");
	   
	   System.out.println(store.managedBy);
	   System.out.println(store.application.getName());
	   
	   System.out.println(store.application.getSizeInMb());
	  
	   System.out.println(store.application.getVersion());
	  
	   System.out.println(store.application.getRating());
	  
	   System.out.println(store.application.getNumOfDownloads());
	  
	   System.out.println(store.application.getCompanyName());
	  
	   
	   
	   
	  
	 }
}