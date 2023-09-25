class Cell{
	private int cellId;
	private String cellName;
	private double voltage;

	public Cell(){

	}

	public void setCellId(int cellId){
		this.cellId=cellId;
	}
	public void setCellName(String cellName){
		this.cellName=cellName;
	}
	public void setVoltage(double voltage){
		this.voltage=voltage;
	}
	public int getCellId(){
		return cellId;
	}
	public String getCellName(){
		return cellName;
	}
	public double getVoltage(){
		return voltage;
	}
}