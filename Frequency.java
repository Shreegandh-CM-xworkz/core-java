import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        //First we should take array of integers as input
        //creating instance of the  Scanner class
        Scanner sc=new Scanner(System.in);
        //now let me create an integer array and i will take the input to specify the size of the array
        System.out.println("Specify the size of the array");
        int size=sc.nextInt();
        int input[]=new int[size];
        System.out.println("Enter the elements to be inserted into the array");
        for (int i=0;i<size;i++){
            input[i]= sc.nextInt();
        }
        //checking what's inside the array
        for (int i=0;i<size;i++){
            System.out.println(input[i]);
        }
     //now i need a variable that should update by 1 whenever the number is repeated
       int count=0;
        System.out.println("Enter the value to the the frequency of that value");
        int value= sc.nextInt();
        //checking the whether the input val matches the element in array
        // if matches increasing the count
        for (int i=0;i< input.length;i++){
            if(input[i]==value){
                count++;
            }
        }
        System.out.println("The frequency of the "+value+" is "+count);


    }

}
