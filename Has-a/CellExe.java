class CellExe{
	public static void main(String[] time){
		Cell cell=new Cell();
		cell.setCellId(789);
		cell.setCellName("Eveready");
		cell.setVoltage(1.5);

		Watch watch=new Watch();
		watch.cell=cell;
		watch.watchName="Fastrack";
		System.out.println("Watch Name : "+watch.watchName);
		System.out.println("Cell id : "+watch.cell.getCellId());
		System.out.println("Cell Name : "+watch.cell.getCellName());
		System.out.println("Cell voltage : "+watch.cell.getVoltage());


	}
}