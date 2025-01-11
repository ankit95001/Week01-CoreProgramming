import java.util.Scanner;
//creating class NaturalNumbersSum for sum
public class NaturalNumbersSum {
	
	//creating method calculateSumRecursively for calculation
	public static int calculateSumRecursively(int n) {
        if (n == 1) return 1;
        return n + calculateSumRecursively(n - 1);
    }
    public static void main(String[] args) {
	
		//creating object of scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
		
        if (number <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }
		
		//Method calling
        int recursiveSum = calculateSumRecursively(number);
        int formulaSum = number * (number + 1) / 2;
		
		//Printing the result
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("The results match: " + (recursiveSum == formulaSum));
		
		//closing the scanner object
		input.close();
    }
}
