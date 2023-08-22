class BlinkitRun {
    public static void main(String food[]) {

        double price = Blinkit.search("sandwich");
        double price1 = Blinkit.search("sandwich", 3);
        System.out.println("the price of sandwich is " + price);
		System.out.println("the price of sandwich is for given quantity is " + price1);

    }

}