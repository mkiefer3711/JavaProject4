//@author Maddison Kiefer

import java.util.Scanner;

public class ClassGradeStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Creating the variables
        float sum = 0;
        float min;
        float max;
        
        // Receiving grade 1 input
        System.out.print("Enter grade 1: ");
        // Using while loop to check that the input is a valid floating-point number
        while(!scnr.hasNextFloat()) {
            System.out.println("Invalid input. Enter a valid floating-point number.");
            // Clears the invalid input
            scnr.next();
        }
        // Assigning variables and creating the grade variable   
        float grade = scnr.nextFloat();
        max = grade;
        min = grade;
        sum += grade;
        
        // For loop used to get inputs for grades 2 through 10
        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter grade " + i + ": ");
            // Using while loop to check that the input is a valid floating-point number
            while (!scnr.hasNextFloat()) {
                System.out.println("Invalid input. Enter a valid floating-point number.");
                // Clears the invalid input
                scnr.next();
            }
            //
            grade = scnr.nextFloat();
            sum += grade;
            
            // Assigns grade to max if the grade is greater than the current max
            if(grade > max) {
                max = grade;
            }
            // Assigns grade to min if the grade is less than the current min
            if(grade < min) {
                min = grade;
            }
        }
   
        // Calculation the average of the grades
        float average = sum / 10;
        
        // Outputting all of the data for the 10 grades input
        System.out.println(" ");
        System.out.println("Grade Data:");
        System.out.println("The average for these grades is: " + average);
        System.out.println("The maximum for these grades is: " + max);
        System.out.println("The minimum for these grades is: " + min);
    }
}
