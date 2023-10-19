package com.me.engineersapp.engineer;

public class MarineEngineer extends Engineer {
    @Override
    public void problemSolving() {
        System.out.println("Marine override");
    }

    public void Vacation(){
        System.out.println("in vacation ");

    }
}
