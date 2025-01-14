import java.util.Scanner;
//Creating class FactorialRecursion for calculation
public class FactorialRecursion {
	public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
    public static void main(String[] args) {
		//creating scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//calculating and printing result
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
