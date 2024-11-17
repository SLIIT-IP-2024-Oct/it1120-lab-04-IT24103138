 import java.util.Scanner;
 
 public class IT24103138Lab4Q1{
	 
	 public static void main (String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number :");
		 int num = sc.nextInt();
		 
		 if (num > 0) {
			 //check the number is grater than 0 or not 
			
			System.out.println("The number is Positive.");
		 }
		 else if (num < 0) {
			 //check the number is less than 0 or not 
			
			System.out.println("The number is Negative.");
		 }
		
		else {
			System.out.println("The number is Zero.");
		}
			
	 }
 }