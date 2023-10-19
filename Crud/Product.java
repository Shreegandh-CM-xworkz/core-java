package com.me.productmanagement.product;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
        private int id;
        private String name;
        private String place;
        private int price;
        private String color;
        private String brand;
        private String warranty;

       public void solveProblem(){
           System.out.println("Solves daily life problems");
       }
       public void solveProblem( String name){

           System.out.println(name+":"+"solves the " +name+" related  problem");

       }
    }
