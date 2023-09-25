class State{

	private String stateId;
	private String stateName;
	private int noOfDistricts;
	private String capital;

	public State(){

	}
	public void setStateId(String stateId){
		this.stateId=stateId;
	}
	public void setStateName(String stateName){
		this.stateName=stateName;
	}
	public void setNoOfDistricts(int noOfDistricts){
		this.noOfDistricts=noOfDistricts;
	}
	public void setCapital(String capital){
		this.capital=capital;
	}
	public String getStateId(){
		return stateId;
	}
	public String getStateName(){
		return stateName;
	}
	public int getNoOfDistricts(){
		return noOfDistricts;
	}
	public String getCapital(){
		return capital;
	}

}