class RefillExe{
	public static void main(String[] ref){

	Refill refill=new Refill();
	refill.setRefillName("Nataraja");
	refill.setColore("Red");
	refill.setType("Use and tough");

	Pen pen=new Pen();
	pen.refill=refill;

	pen.penName="Nataraja Pen";

	System.out.println("Pen Name"+pen.penName);
	System.out.println("Refill Name : "+pen.refill.getRefillName());
	System.out.println("Refill colour : "+pen.refill.getColore());
	System.out.println("Refill type : "+pen.refill.getType());

	}
}