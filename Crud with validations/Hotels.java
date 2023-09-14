class Hotels{
String foodNames[] = new String[10];
int index;
public boolean addFoodName(String foodName){
System.out.println("invoked addFoodName()");
boolean isAdded = false;
if(index < foodNames.length){
if(foodName != null){
	boolean exist = checkIfFoodNameExist(foodName);
	if(exist== false){
System.out.println("validation is proper.. proceed to add Food name");
foodNames[index]= foodName;
index++;
isAdded  = true;
System.out.println(foodName+"is got added successfully!!");
System.out.println(foodName+" is got added successfully!!");
}
else{
	System.out.println(foodName+" Food name already exist .. please add other");
}
}	
}
else{
	System.out.println("Array index out of bound Exception");
}
return isAdded;
}
public void  getFoodNames(){

}

public boolean checkIfFoodNameExist(String foodName){
	System.out.println("Invoked checkIfFoodNameExist");
	boolean exist = false;
	for(int index = 0;index < foodNames.length; index++){
if(foodNames[index] ==  foodName){
	exist = true;
}
}
return exist;
}
}