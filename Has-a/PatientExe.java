class PatientExe{
	public static void main(String[] pat){

	Patient patient=new Patient();
	patient.setPatientId(457);
	patient.setPatientName("Shreegandh");
	patient.setDiseases("Fever");
	patient.setDocName("Rahul");


	Hospital hospital=new Hospital();
	hospital.patient=patient;
	hospital.hospitalName="U.P.R Hospital";

	System.out.println("Hospital Name : "+hospital.hospitalName);
	System.out.println("Patient Id : "+hospital.patient.getPatientId());
	System.out.println("Patient Name : "+hospital.patient.getPatientName());
	System.out.println("Diseases : "+hospital.patient.getDiseases());
	System.out.println("Doctor name : "+hospital.patient.getDocName());

	}
}