import java.util.Scanner;

public class IT24103138Lab4Q3{
	 
	 public static void main (String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number :");
		 int num = sc.nextInt();
		 
		 String result = (num > 0)? "The number is Positive." :
						 (num < 0)? "The number is Negative." :
						 "The number is Zero.";
						 
		System.out.println("The number is " + result);
						 
		 
	 }
	 
}