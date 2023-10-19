package com.me.playstore.hub;

import com.me.playstore.application.Application;

import java.util.Arrays;

public class SoftwareHub {

    //object type array
    Application[] application = new Application[3];

    int index;

    //class type parameter
    public boolean addApplication(Application application) {
        System.out.println("method of addApplication");
        boolean isAdded = false;
        if (application != null) {
            this.application[index++] = application;
            isAdded = true;
            System.out.println("application added to softwareHub successfully");

        }
        return isAdded;
    }

    public void get() {
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index] + " " + application[index].getId() + " " + application[index].getAppName() + " " + application[index].getAppType() + " " + application[index].getVersion() + " " + application[index].getCompanyName() + " " + application[index].getReleaseDate() + " " + application[index].getSizeInMb());
        }
    }

    public Application getApplicationByName(String appName) {
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() == appName) {
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }

    public Application getApplicationById(int appId) {
        Application app = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getId() == appId) {
                app = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return app;
    }

    public Application getApplicationByAppType(String appType) {
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType() == appType) {
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }

    public Application getApplicationNameByType(String appName) {
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() == appName) {
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }

    public Application getApplicationTypeByName(String appType) {
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType() == appType) {
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }

    public boolean upadateAppVersionByName(String updatedVersion, String appName) {
        boolean isVersionUpdated = false;
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppName() == appName) {
                application[i].setVersion(updatedVersion);
                isVersionUpdated = true;
                System.out.println("Application updated");

            }
        }
        return isVersionUpdated;
    }

    public boolean upadateCpmpanyNameAndSizeByName(String updatedCompanyName, String appName,int newSize) {
        boolean isCompanyNameUpdated = false;
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppName() == appName) {
                application[i].setCompanyName(updatedCompanyName);
                application[i].setSizeInMb(newSize);
                isCompanyNameUpdated = true;
                System.out.println("Company Name and Size  updated");

            }
        }
        return isCompanyNameUpdated;


    }
    public void deleteApplicationByAppName(String appName){

        int newIndex ,index;
        for ( index=0,newIndex=0 ;index<this.application.length;index++){
            if(application[index].getAppName()!=appName){
                         application[newIndex++] =application[index];
                System.out.println("App is deleted");
            }
        }
        application= Arrays.copyOf(application,newIndex);

        getAllApplication(application);
    }

    private void getAllApplication(Application [] application) {
           for (int i=0;i<application.length;i++){
               System.out.println(application[i].getAppName());
           }
    }
}