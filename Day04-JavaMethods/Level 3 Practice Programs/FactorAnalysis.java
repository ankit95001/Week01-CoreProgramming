import java.util.Scanner;
//Creating class FactorAnalysis for factor analysis
public class FactorAnalysis {

    // Method to count the factors of a number
    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        return count;
    }

    // Method to find the factors of a number and store them in an array
    public static int[] findFactors(int number) {
        int count = countFactors(number);
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = sumOfFactors(factors) - number; 
        return sum == number;
    }

    // Method to check if a number is abundant
    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = sumOfFactors(factors) - number; 
        return sum > number;
    }

    // Method to check if a number is deficient
    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = sumOfFactors(factors) - number; 
        return sum < number;
    }

    public static void main(String[] args) {
		// Create Scanner object for input
        Scanner input = new Scanner(System.in); 

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Process the number
        int[] factors = findFactors(number);

        // Display results
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number, factors));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number, factors));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number, factors));
		
		// Close the Scanner class obejct
        scanner.close(); 
    }
}
