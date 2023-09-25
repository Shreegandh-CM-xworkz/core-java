class Flats{
	private String flatId;
	private int noOfDoor;
	private int noOfWindoors;

	public Flats(){

	}
	public void setFlatId(String flatId){
		this.flatId=flatId;
	}
	public void setNoOfDoors(int noOfDoor){
		this.noOfDoor=noOfDoor;
	}
	public void setNoOfWindoors(int noOfWindoors){
		this.noOfWindoors=noOfWindoors;
	}
	public String getFlatId(){
		return flatId;
	}
	public int getNoOfDoors(){
		return noOfDoor;
	}
	public int getNoOfWindoors(){
		return noOfWindoors;
	}

}