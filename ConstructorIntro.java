


class ConstructorIntro{

    public ConstructorIntro(){
        System.out.println("Constructor is called");
    }
	public ConstructorIntro(int a,int b){
		int result=a+b;
		System.out.println(result);
	}
}

        
 class Main {
    public static void main(String[] args) {
        ConstructorIntro constructor =new ConstructorIntro(3,4);
       

    }
}