class KitchenExe{

	public static void main(String[] food){
		Kitchen kitchen=new Kitchen();
		kitchen.setKitchenName("Dev kitchen ");
		kitchen.setCookName("Devendra Singh");
		kitchen.setDishName("Obbattu");
		kitchen.setTypeOfDish("Sweet");

		Hotel hotel=new Hotel();
		hotel.kitchen=kitchen;
		hotel.hotelName="Swiggy kitchen";

		System.out.println("Hotel Name : "+hotel.hotelName);

		System.out.println("Kitchen Name : "+hotel.kitchen.getKitchenName());
		System.out.println("Kitchen Cook Name : "+hotel.kitchen.getCookName());
		System.out.println("Dish Cooked in Kitchen : "+hotel.kitchen.getDishName());
		System.out.println("Type of Dish : "+hotel.kitchen.getTypeOfDish());

	}
}