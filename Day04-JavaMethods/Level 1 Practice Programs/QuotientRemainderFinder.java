import java.util.Scanner;
//Creating class QuotientRemainderFinder for finding the Quotient and Remainder
public class QuotientRemainderFinder {

	//creating the method for calculation
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
		//creating scanner object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
		
		//Calling the method fro result
        int[] result = findRemainderAndQuotient(dividend, divisor);
		
		//Displying the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
		
		//Closing the Scanner object
		input.close();
    }
}
