package com.me.playstore;

import com.me.playstore.application.Application;
import com.me.playstore.hub.SoftwareHub;


public class  AppExecutor {
    public static void main(String[] args) {
        Application app = new Application();
        app.setId(1);
        app.setAppName("Whatsapp");
        app.setSizeInMb(182);
        app.setVersion("2.1v");
        app.setReleaseDate("21/08/2009");
        app.setCompanyName("Meta");
        app.setAppType("Social Media");

//        Application app1 = new Application();
        app.setId(2);
        app.setAppName("Instagram");
        app.setSizeInMb(200);
        app.setVersion("4.5v");
        app.setReleaseDate("21/08/2009");
        app.setCompanyName("Meta");
        app.setAppType("Social Media");

//        Application app2 = new Application();
        app.setId(3);
        app.setAppName("Spotify");
        app.setSizeInMb(33);
        app.setVersion("8.8v");
        app.setReleaseDate("26/02/2019");
        app.setCompanyName("Spotify AB");
        app.setAppType("Music and Podcast");

        SoftwareHub softwareHub = new SoftwareHub();
        softwareHub.addApplication(app);
        softwareHub.addApplication(app);
        softwareHub.addApplication(app);



//        Application application = softwareHub.getApplicationByName("Spotify");
//        System.out.println(app2.getAppName() + " " + app2.getAppType() + " " + app2.getCompanyName() + " " + app2.getReleaseDate() + " " + app2.getVersion() + " " + app2.getSizeInMb() + " ");
//
//
//        Application appsId = softwareHub.getApplicationById(3);
//        System.out.println(app2.getAppName() + " " + app2.getAppType() + " " + app2.getCompanyName() + " " + app2.getReleaseDate() + " " + app2.getVersion() + " " + app2.getSizeInMb() + " ");
//
//        Application appType = softwareHub.getApplicationByAppType("String");
//        System.out.println(app1.getAppName() + " " + app1.getAppType() + " " + app1.getCompanyName() + " " + app1.getReleaseDate() + " " + app1.getVersion() + " " + app1.getSizeInMb() + " ");
//
//        Application appName = softwareHub.getApplicationNameByType("Whatsapp");
//        System.out.println(app.getAppName() + " " + app.getAppType() + " " + app.getCompanyName() + " " + app.getReleaseDate() + " " + app.getVersion() + " " + app.getSizeInMb() + " ");
//
//        Application appsType = softwareHub.getApplicationTypeByName("String");
//        System.out.println(app2.getAppName() + " " + app2.getAppType() + " " + app2.getCompanyName() + " " + app2.getReleaseDate() + " " + app2.getVersion() + " " + app2.getSizeInMb() + " ");

//
//        softwareHub.upadateAppVersionByName("2.2v", "Whatsapp");
//        System.out.println(app.getVersion());
//        softwareHub.upadateCpmpanyNameAndSizeByName("Facebook","Whatsapp",200);
//        System.out.println(app.getAppName()+" "+app.getCompanyName()+" " +app.getVersion()+" " +app.getSizeInMb());
//         softwareHub.get();
//        softwareHub.deleteApplicationByAppName("Whatsapp");
    //    softwareHub.getApplicationNameByType("Whatsapp");
        softwareHub.getApplicationById(2);
    }

}