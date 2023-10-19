package com.me.station.policestation;

import com.me.station.officer.Officer;

import java.util.Arrays;

public class PoliceStation {

    Officer[] officer;


    public PoliceStation (int size){
       officer= new Officer[size];
    }
    int index;

    public boolean addOfficers(Officer officer) {
        boolean isAdded = false;
        if (officer != null) {
            this.officer[index++] = officer;
            isAdded = true;
            System.out.println("Officer added");

        }
        return isAdded;
    }

    public void getAllOfficers() {
        for (int i = 0; i < officer.length; i++) {
            System.out.println("Name :" + officer[i].getName() +"\n "+
                    " ID :" + officer[i].getId() +"\n "+
                    "Address :" + officer[i].getAddress() +"\n "+
                    "Age :" + officer[i].getAge() +"\n "+
                    "Gender :" + officer[i].getGender() +"\n "+
                    "Post :" + officer[i].getPostName() +" \n"+
                    "Blood Group :" + officer[i].getBloodGroup());
        }
    }

        public String[] getOfficersNameByPostName(String postName) {
            String[] matchingNames = new String[officer.length];
            int count = 0;

            for (int i = 0; i < officer.length; i++) {
                if (officer[i] != null && officer[i].getPostName().equals(postName)) {
                    matchingNames[count] = officer[i].getName();
                    count++;
                }
            }

            // Create a new array with the exact size of matching names and copy the names
            String[] result = new String[count];
            System.arraycopy(matchingNames, 0, result, 0, count);

            return result;
        }


        public String getAddressById(int id) {
   String address=null;
        for (int i = 0; i < officer.length; i++) {
            if (officer[i].getId()== id) {
               address= officer[i].getAddress();
            }

        }
        return address;
    }

    public int getAgeByName(String name) {
     int age=0;
        for (int i = 0; i < officer.length; i++) {
            if (officer[i].getName().equals(name)) {
               age= officer[i].getAge();
            }
        }
        return age;
    }

    public void officersInfoById(int Id) {
        for (int i = 0; i < officer.length; i++) {
            if (officer[i].getId() == Id) {
                System.out.println("Address :" + officer[i].getName() +
                        "Address :" + officer[i].getAddress() +
                        "Age :" + officer[i].getAge() +
                        "Gender :" + officer[i].getGender() +
                        "Post :" + officer[i].getPostName() +
                        "Blood Group :" + officer[i].getBloodGroup());

            } else {
                System.out.println("Not Found");
            }
        }
    }

    public String getPostNameByName(String name) {
        for (int i = 0; i < officer.length; i++) {

            if (officer[i].getName().equals(name)) {

                return officer[i].getPostName();

            }

        }


        return null;
    }

    public String getPostNameById(int id) {

        for (int i = 0; i < officer.length; i++) {
            if (officer[i].getId() == id) {
               return officer[i].getPostName();

            }

        }


        return null;
    }

    public boolean updatePostNameByOfficersName(String name, String newPostName) {
        boolean isUpdated = false;
        for (int i = 0; i < officer.length; i++) {
            if (officer[i].getName().equals(name)) {
                officer[i].setPostName(newPostName);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public void deleteOfficerById(int id) {
        int i, index;
        for (i = 0, index = 0; i < officer.length; i++) {
            if (officer[i].getId() != id) {
                officer[index++] = officer[i];
                System.out.println("Officer is deleted");

            }
        }
        officer = Arrays.copyOf(officer, index);
        for (int j = 0; j < this.officer.length; j++) {
            System.out.println("Address :" + officer[j].getName() +
                    " Officer ID :" + officer[j].getId() +
                    "Address :" + officer[j].getAddress() +
                    "Age :" + officer[j].getAge() +
                    "Gender :" + officer[j].getGender() +
                    "Post :" + officer[j].getPostName() +
                    "Blood Group :" + officer[j].getBloodGroup());


        }


    }
}




