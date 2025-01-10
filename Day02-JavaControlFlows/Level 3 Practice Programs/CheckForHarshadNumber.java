import java.util.Scanner;
//Creating class CheckForHarshadNumber for check
public class CheckForHarshadNumber {
    public static void main(String[] args) {
		//creating scanner object for input
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        int tempNumber = number; // Keep the original number for comparison
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;            
            number /= 10;  
        }

        // Check if the original number is divisible by the sum of its digits
        if (tempNumber % sum == 0) {
            System.out.println(tempNumber + " is a Harshad Number.");
        } else {
            System.out.println(tempNumber + " is not a Harshad Number.");
        }
		//close the scanner obejct
        input.close();
    }
}