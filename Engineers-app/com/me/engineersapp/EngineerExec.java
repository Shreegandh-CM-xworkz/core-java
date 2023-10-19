package com.me.engineersapp;

import com.me.engineersapp.engineer.CsEngineer;
import com.me.engineersapp.engineer.Engineer;
import com.me.engineersapp.engineer.MarineEngineer;

public class EngineerExec {
    public static void main(String[] args) {
        Engineer eng= new CsEngineer();
        Engineer eng1= new MarineEngineer();
        CsEngineer cs=(CsEngineer) eng;
        cs.softwareDevelopment();
        MarineEngineer me=(MarineEngineer) eng1;
        me.Vacation();
        eng.problemCreating();


    }
}
