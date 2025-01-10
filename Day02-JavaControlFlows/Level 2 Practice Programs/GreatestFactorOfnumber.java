import java.util.Scanner;
//Creating class GreatestFactorOfnumber for finding the factor
public class GreatestFactorOfnumber {
    public static void main(String[] args) {
		//create scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        int number = input.nextInt();

        // Checking if the input is a positive number or not
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            // Initialize the greatest factor
            int greatestFactor = 1;

            // Loop to find the greatest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
					// Getting out of the loop once the greatest factor is found
                    break; 
                }
            }

            // Display result
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
		//close the scanner object
        input.close();
    }
}
