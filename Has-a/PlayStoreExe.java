class PlayStoreExe{

    public static void main (String args[]){
	 
	    Application app = new Application();
        app.setName("Mr.Driver");
        app.setSizeInMb(589.36D);
        app.setVersion("v.1.0.8");
        app.setRatings("4.6");
        app.hufNoOfDownloads("45 Millions");
		
		
		
        PlayStore store = new PlayStore();
		// has-A relationship
        store.application = app;
		store.manegedBy="Google";
		
		
		System.out.println("Company owned by : "+store.manegedBy);
        System.out.println("Application name is : "+store.application.getName());
        System.out.println("Application size in Mb is : "+store.application.getSizeInMb());
        System.out.println("Version of the application is : "+store.application.getVersion());
        System.out.println("Ratings obtained for application is : "+store.application.getRatings());
        System.out.println("Application downloads is : "+app.ghfNoOfDownloads());
 		
	}
}