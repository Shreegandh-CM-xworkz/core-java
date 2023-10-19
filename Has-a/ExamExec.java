class ExamExec{
 public static void main(String[] vtuExam){
    HallTicket ticket=new HallTicket(202,"Shreegandh CM","4MC19IS053"); 
	 //HallTicket ticket=null;
	 Exam exam=new Exam(ticket);
	 exam.fees=1300; 
	 //exam.fees=100;
	 exam.write();
	 
	 
	 
	 
	 
	 
	 
 }
}