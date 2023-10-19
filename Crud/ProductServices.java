package com.me.productmanagement.services;

import com.me.productmanagement.electronics.ElectronicProducts;
import com.me.productmanagement.product.Product;

import java.util.Arrays;

public class ProductServices {
    Product [] product;


   public ProductServices(int size){
        product=new Product[size];

    }
    int index;
   int count=1;
    public boolean addProduct(Product product){
       boolean isAdded=false;
        if(product!=null){
            product.setId(count++);
            this.product[index++]=product;
            isAdded=true;
            System.out.println("Product is added");
        }
        return isAdded;
    }
    public void getProducts(){
        for (int i=0;i<product.length;i++){
            System.out.println("ID : "+product[i].getId()+"\n"+
                               "Name : "+product[i].getName()+"\n"+
                               "Place : "+product[i].getPlace());
        }

    }
    public String getProductNameById(int Id){
        for (int i = 0; i < product.length ; i++) {
            if (product[i].getId()==Id){
                return product[i].getName();
            }
        }
       return null;
    }
    public String getPlaceById(int Id){
        for (int i = 0; i < product.length ; i++) {
            if (product[i].getId() == Id) {
                return product[i].getPlace();

            }
        }
        return null;
    }

    public String getWarrantyByName(String name){
        String warranty=null;
        for (int i=0;i< product.length;i++){
            if (product[i].getName().equals(name)){
               warranty= product[i].getWarranty();
            }
        }
        return warranty;
    }

     public boolean updateWarranty(String name,String newWarranty){
        boolean isUpdated=false;
        for (int i=0;i< product.length;i++){
            if(product[i].getName().equals(name)){
                product[i].setWarranty(newWarranty);
                isUpdated=true;
                System.out.println("Warranty is updated");
            }
        }
        return isUpdated;
     }
     public void deleteByName(String name){
       int i,index;
       for (i=0,index=0;i< product.length;i++){
           if (!product[i].getName().equals(name)){
               product[index++]=product[i];
               System.out.println("Product is deleted");
           }
       }
       product= Arrays.copyOf(product,index);
       getProducts();


       }
          public void deleteById(int Id){
       int i,index;
       for (i=0,index=0;i< product.length;i++){
           if (product[i].getId()!=Id){
               product[index++]=product[i];
               System.out.println("Product is deleted");
           }
       }
       product= Arrays.copyOf(product,index);
       getProducts();


       }
  public int productPriceByName(String name){
        int price=0;
        for (int i=0;i<product.length;i++){
            if (product[i].getName().equals(name)){
                price=product[i].getPrice();
            }
        }
        return price;
  }
    public String[] getProdsByPlaceName(String place){
        String [] matchingProducts=new String[product.length];
        int count=0;
        for (int i = 0; i < product.length; i++) {
            if (product[i]!=null && product[i].getPlace().equals(place)){
                matchingProducts[count]=product[i].getPlace();
                System.out.println(product[i].getPlace());
                count++;
            }

        }
        String [] result=new String[count];
        System.arraycopy(matchingProducts,0,result,0,count);
        return result;
    }


     }

