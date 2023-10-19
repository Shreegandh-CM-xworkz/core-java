package com.me.station;

import com.me.station.officer.Officer;
import com.me.station.policestation.PoliceStation;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int size=sc.nextInt();
        PoliceStation policeStation=new PoliceStation(size);
        for (int i = 0; i <size; i++) {
            Officer officer=new Officer();
            System.out.println("Enter  the officer name");
            officer.setName(sc.next());
            System.out.println("enter the officer Id");
            officer.setId(sc.nextInt());
            System.out.println("Enter the officer age");
            officer.setAge(sc.nextInt());
            System.out.println("Enter the post name");
            officer.setPostName(sc.next());
            System.out.println("Enter the address of the officer");
            officer.setAddress(sc.next());
//            System.out.println("Enter the blood group of the officer");
//            officer.setBloodGroup(sc.next());
//            System.out.println("Enter the Gender of the officer");
//            officer.setGender(sc.next());

            policeStation.addOfficers(officer);

        }
//        policeStation.getAllOfficers();
//        System.out.println("Enter the id to get adress");
//       String address= policeStation.getAddressById(sc.nextInt());
//        System.out.println(address);
        System.out.println("Enter name to get post name");
        String post= policeStation.getPostNameByName(sc.next());
        System.out.println(post);
        System.out.println("Enter name to get age");
        int age=policeStation.getAgeByName(sc.next());
        System.out.println(age);
        System.out.println("Enter id to get address");
       String adrress= policeStation.getAddressById(sc.nextInt());
        System.out.println(adrress);
        policeStation.getAllOfficers();





        }

    }

