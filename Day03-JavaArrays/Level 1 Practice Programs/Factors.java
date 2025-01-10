import java.util.Scanner;
//Creating class Factors for calculation
public class Factors{
    public static void main(String[] args) {
		// Scanner for user input
        Scanner input = new Scanner(System.in); 
		
		// Reading user input
        System.out.println("Enter a number:");
        int number = input.nextInt(); 

        int maximum = 10; 
        int[] factors = new int[maximum];
        int index = 0;

        // Finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maximum) {
                    maximum *= 2; 
                    int[] temp = new int[maximum];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; 
                }
                factors[index++] = i;
            }
        }

        // Displaying factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

		// Closing the Scanner object
        input.close(); 
    }
}