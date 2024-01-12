package com.xworks.january.boot;

import com.xworks.january.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EMF"+emf);
        EntityManager em =emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et =em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting Operation");
        //ActorEntity actor=new ActorEntity(1,"Dboss","Katera","Celebreties","AngerIssues");
      //   FestivalEntity festival=new FestivalEntity(1,"Sankaranthi","Hindu","2024-01-14",1);
        // FilmEntity film=new FilmEntity(1,"Katera","Dboss","Rockline Venky","2023-12-29");
       //  OceanEntity ocean=new OceanEntity(1,"Indian Ocean",7,"blue whales","India");
        // ResumeEntity resume=new ResumeEntity(1,"latex",3,"Deepu",2);
        // ShopEntity shop=new ShopEntity(1,"teccera","Software",50000,6);
        // SportsEntity sports=new SportsEntity(1,"indoor","carrom",4,"win");
        // SuperHeroEntity superHero=new SuperHeroEntity(1,"Spiderman","usa","web","gf");
        // TrafficEntity traffic=new TrafficEntity(1,"car",60,"Rajaji nagar","land");
         TransportEntity transport=new TransportEntity(1,"land","truck",1500,16);
        em.persist(transport);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Closing em and emf");
        emf.close();
        em.close();


    }
}
