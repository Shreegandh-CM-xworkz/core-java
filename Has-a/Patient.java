class Patient{
	private  int patientId;
	private String patientName;
	private String diseases;
	private String docName;

	public Patient(){

	}
	public void setPatientId(int patientId){
		this.patientId=patientId;
	}
	public void setPatientName(String patientName){
		this.patientName=patientName;
	}
	public void setDiseases(String diseases){
		this.diseases=diseases;
	}
	public void setDocName(String docName){
		this.docName=docName;
	}

	public int getPatientId(){
		return patientId;
	}
	public String getPatientName(){
		return patientName;
	}
	public String getDiseases(){
		return diseases;
	}
	public String getDocName(){
		return docName;
	}


}