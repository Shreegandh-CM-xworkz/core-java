class SwiggyRun {
    public static void main(String food[]) {

        double price = Swiggy.search("Frenchie");
        double price1 = Swiggy.search("Frenchie",6);
        System.out.println("the price of Frenchie is " + price);
		System.out.println("the price of Frenchie is for given quantity is " + price1);

    }

}