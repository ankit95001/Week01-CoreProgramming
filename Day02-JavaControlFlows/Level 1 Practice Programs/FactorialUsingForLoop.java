import java.util.Scanner;
// creating FactorialUsingWhile class for calculation
class FactorialUsingForLoop{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer- ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // calculate factorial using a while loop
            int factorial = 1;
            int currentMultiplier;

            for(currentMultiplier=1;currentMultiplier<number;currentMultiplier++) {
                factorial *= currentMultiplier;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        //Closing the scanner object
        input.close();
    }
}