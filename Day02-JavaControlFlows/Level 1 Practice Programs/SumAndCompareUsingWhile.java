import java.util.Scanner;
//creating SumAndCompare class for the compare
public class SumAndCompareUsingWhile{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Compute the sum using a for loop
            int sumUsingWhile = 0;
            int i=0;
            while(i<number) {
                sumUsingWhile += i;
                i++;
            }

            // Computing the sum using the formula
            int sumUsingFormula = number * (number + 1) / 2;

            System.out.println("Sum using for loop: " + sumUsingFor);
            System.out.println("Sum using formula: " + sumUsingFormula);

            // Comparing the results
            if (sumUsingWhile == sumUsingFormula) {
                System.out.println("Both computations are correct and produce the same result");
            } else {
                System.out.println("Results are different");
            }
        }

        input.close();
    }
}