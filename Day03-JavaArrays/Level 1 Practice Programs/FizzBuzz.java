import java.util.Scanner;
//Creating class FizzBuzz for calculating
public class FizzBuzz {
    public static void main(String[] args) {
	
		// Scanner for user input
        Scanner input = new Scanner(System.in); 
		
        System.out.println("Enter a positive integer- ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
		
		// Array to store FizzBuzz results
        String[] results = new String[number + 1]; 

        // Generating FizzBuzz results
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Displaying the results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
		
		// Closing the Scanner object
        input.close(); 
    }
}
