package com.me.productmanagement;

import com.me.productmanagement.electronics.ElectronicProducts;
import com.me.productmanagement.product.Product;
import com.me.productmanagement.services.ProductServices;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        ProductServices services = new ProductServices(size);
        for (int i = 0; i < size; i++) {
            Product product = new Product();
            System.out.println("Enter name of the E-product");
            product.setName(sc.next());
            System.out.println("Enter the place where the E-product is placed");
            product.setPlace(sc.next());
            System.out.println("Enter the color of the product");
            product.setColor(sc.next());
            System.out.println("Enter the brand name ");
            product.setBrand(sc.next());
            System.out.println("Enter the warranty ");
            product.setBrand(sc.next());
            System.out.println("Enter product price ");
            product.setPrice(sc.nextInt());


            services.addProduct(product);

        }
        String input = null;
        do {
            System.out.println("Press 1:To get all the Products");
            System.out.println("Press 2:To get product name by Id");
            System.out.println("Press 3:To get place by Id");
            System.out.println("Press 4:To get warranty of the product");
            System.out.println("Press 5:To Update warranty");
            System.out.println("Press 6:To delete a product");
            System.out.println("Press 7:To get product Price");
            System.out.println("Press 8:To get products on perticular place");

            int options = sc.nextInt();
            switch (options) {
                case 1:
                    services.getProducts();
                    break;
                case 2:
                    System.out.println("Enter id to ge product Name");
                    String name= services.getProductNameById(sc.nextInt());
                    System.out.println(name);
                    break;
                case 3:
                    System.out.println("Enter id to get place of the product");
                    String place=services.getPlaceById(sc.nextInt());
                    System.out.println(place);
                    break;
                case 4:
                    System.out.println("Enter name to get warranty");
                    String warranty=services.getWarrantyByName(sc.next());
                    System.out.println(warranty);
                    break;
                case 5:
                    System.out.println("Enter name of the product to update warranty");
                    String name1= sc.next();
                    String newWarranty= sc.next();
                    services.updateWarranty(name1,newWarranty);
                    break;
                case 6:
                    System.out.println("Enter product name or id to delete product");
                    int id= sc.nextInt();
                    String name2=sc.next();


                    break;
                case 7:
                    System.out.println("Enter product name to get price of the product");
                    services.productPriceByName(sc.next());
                    break;
                case 8:
                    System.out.println("Enter place");
                    services.getProdsByPlaceName(sc.next());
                    break;
                default:
                    System.out.println("ivalid input");
            }
            System.out.println("Do you want to continue yes/no");
            input = sc.next().toLowerCase();

        }
            while (input.equals("yes"));
        System.out.println("Thank you for visiting ");

        }


}
