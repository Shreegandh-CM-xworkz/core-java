class ChatShop{
   String chats[]=new String[10];
   int index=0;
   
   public boolean addChat(String chat){
   boolean isAdded=false;
   if(index<chats.length){
       if(chat!=null){
	    chats[index]=chat;
		index++;
	    isAdded=true;
	   } 
     }
	 else
	 {
		 System.out.println("Menu is filled");
	 }
    return isAdded	;
   }
   public void getChats(){
     for(int i=0;i<chats.length;i++){
	 System.out.println("List of chats "+chats[i]);
	 }
   }

}