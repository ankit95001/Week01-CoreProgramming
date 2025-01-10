import java.util.Scanner;
//Creating class Odd and Even for calculation
public class OddEven{
    public static void main(String[] args) {
		// Scanner for user input
        Scanner input = new Scanner(System.in); 
		
        System.out.println("Enter a natural number:");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }
		// Array for even numbers
        int[] even = new int[number / 2 + 1];

		// Array for odd numbers
        int[] odd = new int[number / 2 + 1]; 
		
		// Index variables for arrays
        int evenIndex = 0, oddIndex = 0; 

        // Loop to separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Displaying the arrays
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

		// Closing the Scanner object
        input.close(); 
    }
}
