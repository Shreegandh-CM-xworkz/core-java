class Hardware{
	private String hardwareName;
	private int price;
	private String comanyName;
	private double weigth;

	public Hardware(){

	}
	public void setHardwareName(String hardwareName){
		this.hardwareName=hardwareName;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setComanyName(String comanyName){
		this.comanyName=comanyName;
	}
	public void setWeigth(double weigth){
		this.weigth=weigth;
	}

	public String getHardwareName(){
		return hardwareName;
	}
	public int getPrice(){
		return price;
	}

	public String getComanyName(){
		return comanyName;
	}
	public double getWeigth(){
		return weigth;
	}

}