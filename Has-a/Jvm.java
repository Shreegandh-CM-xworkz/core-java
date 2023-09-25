class Jvm{
	private String purpose;
	private String version;
	private String platform;

	public Jvm(){

	}
	public void setPurpose(String purpose){
		this.purpose=purpose;
	}
	public void setVersion(String version){
		this.version=version;
	}
	public void setPlatform(String platform){
		this.platform=platform;
	}
	public String getPurpose(){
		return purpose;
	}
	public String getVersion(){
		return version;
	}
	public String getPlatform(){
		return platform;
	}

}