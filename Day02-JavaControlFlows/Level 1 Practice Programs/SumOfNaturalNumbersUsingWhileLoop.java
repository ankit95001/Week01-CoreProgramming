import java.util.Scanner;
//creating SumOfNaturalNumbersUsingWhileLoop class for the calculation
class SumOfNaturalNumbersUsingWhileLoop{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number - ");
        int number = input.nextInt();

        // Check if the input is a natural number
        if(number<=0){
            System.out.println("Please enter natural number");
        }else{
            // Computing the sum using a while loop
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum += i;
                i++;
            }

            // Compute the sum using the formula
            int sumByFormula = number*(number+1)/2;

            // Display the results of sum
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + sumByFormula);

            // Compare the results
            if (sum == sumByFormula) {
                System.out.println("Both computations are correct and produce the same result");
            } else {
                System.out.println("Results are different");
            }
        }
        //close the scanner object
        input.close();
    }
}