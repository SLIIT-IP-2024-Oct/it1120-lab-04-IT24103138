import java.util.Scanner;

public class IT24103138Lab4Q2{
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // Input exam marks
        
        System.out.print("Enter exam marks (0-100): ");
        double examMarks = sc.nextDouble();
        if (examMarks >= 0 && examMarks <= 100) {
            // Valid exam marks
        } else {
            System.out.println("Invalid input. Exam marks must be between 0 and 100.");
            return; // Exit the program if it is invalid
        }

        // Input lab submission marks
        
        System.out.print("Enter lab submission marks (0-100): ");
        double labMarks = sc.nextDouble();
        if (labMarks >= 0 && labMarks <= 100) {
            // Valid lab marks
        } else {
            System.out.println("Invalid input. Lab submission marks must be between 0 and 100.");
            return; // Exit the program if it is invalid
        }

        // Input the percentage for exam and lab
        
        System.out.print("Enter the percentage for exam marks: ");
        double examPercentage = sc.nextDouble();
        System.out.print("Enter the percentage for lab submission marks: ");
        double labPercentage = sc.nextDouble();

        if (examPercentage >= 0 && labPercentage >= 0 && examPercentage + labPercentage == 100) {
            // Valid percentages
        } else {
            System.out.println("Invalid input. Total Percentages must be up to 100 .");
            return; // Exit the program if it is invalid
        }

        // Calculate the final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Display the final mark
        System.out.println("Final mark is : " + finalMark);

        sc.close();
    }
}
