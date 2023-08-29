class LenscartExecuter{
   public static void main (String args[]){
       Lenscart lens=new Lenscart();
	    lens.productId=1;
		lens.productName="SuperFlexi";
		lens.mfgDate="1/1/2022";
		lens.price=999;
		lens.color="Black"; 
		lens.storedInWarehouse();
		
		Lenscart lens1=new Lenscart();
	    lens1.productId=2;
		lens1.productName="SuperFlexi";
		lens1.mfgDate="2/1/2022";
		lens1.price=1599;
		lens1.color="Black";
		
		
		Lenscart lens2=new Lenscart();
	    lens2.productId=3;
		lens2.productName="SuperFlexi";
		lens2.mfgDate="3/1/2022";
		lens2.price=1999;
		lens2.color="Black";
		
		Lenscart lens3=new Lenscart();
	    lens3.productId=4;
		lens3.productName="SuperFlexi";
		lens3.mfgDate="4/1/2022";
		lens3.price=2999;
		lens3.color="Black";
		
		Lenscart lens4=new Lenscart();
	    lens4.productId=5;
		lens4.productName="SuperFlexi";
		lens4.mfgDate="5/1/2022";
		lens4.price=3999;
		lens4.color="Black";
		
		System.out.println("Product id is "+lens.productId);
         System.out.println("Product name is " +lens.productName);
		 System.out.println("Mfg date " +lens.mfgDate);
		 System.out.println("Price of the product " +lens.price);
		 System.out.println("Color of the product is " +lens.color);
		 System.out.println("\n");
		 
   
		System.out.println("Product id is "+lens1.productId);
         System.out.println("Product name is " +lens1.productName);
		 System.out.println("Mfg date " +lens1.mfgDate);
		 System.out.println("Price of the product " +lens1.price);
		 System.out.println("Color of the product is " +lens1.color);
   System.out.println("\n");
		System.out.println("Product id is "+lens2.productId);
         System.out.println("Product name is " +lens2.productName);
		 System.out.println("Mfg date " +lens2.mfgDate);
		 System.out.println("Price of the product " +lens2.price);
		 System.out.println("Color of the product is " +lens2.color);
   System.out.println("\n");
		System.out.println("Product id is "+lens3.productId);
         System.out.println("Product name is " +lens3.productName);
		 System.out.println("Mfg date " +lens3.mfgDate);
		 System.out.println("Price of the product " +lens3.price);
		 System.out.println("Color of the product is " +lens3.color);
   System.out.println("\n");
		System.out.println("Product id is "+lens4.productId);
         System.out.println("Product name is " +lens4.productName);
		 System.out.println("Mfg date " +lens4.mfgDate);
		 System.out.println("Price of the product " +lens4.price);
		 System.out.println("Color of the product is " +lens4.color);
   
   }
 }
   
 