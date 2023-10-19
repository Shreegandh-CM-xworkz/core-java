class HallTicket{
    int hallTicketNum;
	String studentName;
	String UsnNum;
	
	public HallTicket(int hallTicketNum,String studentName,String UsnNum){
	            this.hallTicketNum=hallTicketNum;
				this.studentName=studentName;
				this.UsnNum=UsnNum;
	}
	public void getDetailes(){
		System.out.println("Candidates Hall ticket number "+this.hallTicketNum);
		System.out.println("Candidates name is "+this.studentName);
		System.out.println("Candidates usn number "+this.UsnNum);
		
	}

}