class StateExe{
	public static void main(String[] ok){
		State state=new State();
		state.setStateId("KA");
		state.setStateName("Karnataka");
		state.setNoOfDistricts(31);
		state.setCapital("Bengaluru");

		Country country=new Country();
		country.state=state;

		country.countryName="India";

		System.out.println("Country name : "+country.countryName);
		System.out.println("State Id : "+country.state.getStateId());
		System.out.println("State Name : "+country.state.getStateName());
		System.out.println("No of Districts in the State : "+country.state.getNoOfDistricts());
		System.out.println("Capital name : "+country.state.getCapital());

	}
}