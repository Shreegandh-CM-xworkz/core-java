class FishExe{

	public static void main(String[] machele){
		Fish fish=new Fish();
		fish.setFishId(123);
		fish.setFishName("Salmon");
		fish.setPrice(3613.0);
		fish.setWeight(5.4);

		Water water=new Water();
		water.fish=fish;
		water.waterType="brackish water";
		System.out.println("Water Type : "+water.waterType);
		System.out.println("Fish Id : "+water.fish.getFishId());
		System.out.println("Fish Name : "+water.fish.getFishName());
		System.out.println("Fish Price : "+water.fish.getPrice());
		System.out.println("Fish Weigth : "+water.fish.getWeight());

	}

}