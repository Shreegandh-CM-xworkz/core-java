class Passengers{
	private int  passengerId;
	private String passengerName;
	private String startingPoint;
	private String destination;

	public Passengers(){

	}

	public void setPassengerId(int  passengerId){
		this.passengerId=passengerId;
	}
	public void setPassengerName(String passengerName){
		this.passengerName=passengerName;
	}
	public void setStartingPoint(String startingPoint){
		this.startingPoint=startingPoint;
	}
	public void setDestination(String destination){
		this.destination=destination;
	}
	public int getPassengerId(){
		return passengerId;
	}
	public String  getPassengerName(){
		return passengerName;
	}
	public String  getStartingPoint(){
		return startingPoint;
	}
	public String  getDestination(){
		return destination;
	}

}