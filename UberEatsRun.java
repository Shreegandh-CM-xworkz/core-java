class UberEatsRun {
    public static void main(String food[]) {

        double price = UberEats.search("rostedDuck");
        double price1 = UberEats.search("rostedDuck",5);
        System.out.println("the price of rostedDuck is " + price);
		System.out.println("the price of rostedDuck is for given quantity is " + price1);

    }

}