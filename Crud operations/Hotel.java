class Hotel{
  String menu[]= new String[10];
   int index=0;
   public boolean addItems(String item){
	   boolean isAdded=false;
	   if(item!=null){
		   menu[index]=item;
		   index++;
		   isAdded=true;
		   
	   }
	   return isAdded;
	   
	}
	public void getMenu(){
		for(int i=0;i<menu.length;i++){
			System.out.println("Chats in the menu "+menu[i]);
		}
	}

}