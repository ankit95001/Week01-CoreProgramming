import java.util.Scanner;
// creating CountDigitsOfNumber class for counting the digit
public class CountDigitsOfNumber {
    public static void main(String[] args) {
	
	    // Create Scanner class object for input
        Scanner input = new Scanner(System.in);

        //taking input from user to enter an integer
        int number = input.nextInt();

        // For negative number
        number = Math.abs(number);

        int count = 0;

        // Special case: for zero
        if (number == 0) {
            count = 1;
        } else {
            // Use a while loop to count the digits
            while (number != 0) {
                number = number / 10; 
                count++;             
            }
        }

        // Display result
        System.out.println("The number of digits is: " + count);

        // Close the scanner object
        input.close(); 
    }
}