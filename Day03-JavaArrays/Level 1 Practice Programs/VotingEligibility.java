import java.util.Scanner;
//create class VotingEligibility for check eligibility
public class VotingEligibility {
    public static void main(String[] args) {
		// Creating Scanner object
        Scanner input = new Scanner(System.in); 
		// Array to store ages of students
        int[] ages = new int[10]; 

        // Taking input for all 10 students
        System.out.println("Enter the ages of 10 students: ");
		// Read age for each student
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt(); 
        }

        // Checking voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
		// Closing the Scanner object
        input.close(); 
    }
}