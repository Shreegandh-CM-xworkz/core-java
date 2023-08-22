class DunzooRun {
    public static void main(String food[]) {

        double price = Blinkit.search("gulabjamun");
        double price1 = Blinkit.search("gulabjamun", 3);
        System.out.println("the price of gulabjamun is " + price);
		System.out.println("the price of gulabjamun is for given quantity is " + price1);

    }

}