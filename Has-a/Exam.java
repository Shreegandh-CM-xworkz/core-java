class Exam{
   HallTicket ticket;
   
   int fees;
   public Exam(HallTicket ticket){
	   this.ticket=ticket;
   }
   
   
   public boolean write(){
	   boolean isAlowed=false;
	   
	 if(fees>=1200){
		 System.out.println("Fees paid... ");
		 if(ticket!=null){
			 System.out.println("Hall ticket issued");
			 ticket.getDetailes();
			 isAlowed=true;
		 }else{
			 System.out.println("Ticket detailes not found");
			 }
		 
	 } else{
		 System.out.println("Please clear the due..");
		 } 
	   return isAlowed;
   }
}