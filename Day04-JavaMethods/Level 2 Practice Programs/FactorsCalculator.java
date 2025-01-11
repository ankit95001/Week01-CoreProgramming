import java.util.Scanner;
//Creating FactorsCalculator class for calculating the factors
public class FactorsCalculator {
	
	//create method findFactors 
	public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }
	
	//method for sum calculation
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }
	
	//create method for product calculation
    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }
	
	//create  method for sum of square
    public static int calculateSumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += Math.pow(factor, 2);
        return sum;
    }
    public static void main(String[] args) {
	
		//creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//calling method for finding factor
        int[] factors = findFactors(number);
		
		//calling method for finding sum
        int sum = calculateSum(factors);
		
		//calling method for finding product
        int product = calculateProduct(factors);
		
		//calling method for sum of square
        int sumOfSquares = calculateSumOfSquares(factors);
		
		//displaying the result
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
		
		//closing the scanner object
		input.clsoe();
    }
}
