class HardwareExe{
	public static void main(String[] phone){


	Hardware hardware=new Hardware();
	hardware.setHardwareName("Mi note 8 pro");
	hardware.setPrice(19999);
	hardware.setComanyName("Xiaomi");
	hardware.setWeigth(200);

	Software software=new Software();
	software.hardware=hardware;
	software.softwareName="Android 11";

	System.out.println("Soft ware in Hardware : "+software.softwareName);
	System.out.println("Hard Ware Component Name : "+software.hardware.getHardwareName());
	System.out.println("Price of the Hardware Component : "+software.hardware.getPrice());
	System.out.println("Company : "+software.hardware.getComanyName());
	System.out.println("weigth of the component in grams: "+software.hardware.getWeigth());

	}
}