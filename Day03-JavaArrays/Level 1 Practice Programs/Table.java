import java.util.Scanner;
// Creating class Table for printing the table
public class Table {
    public static void main(String[] args) {
	// Scanner for user input
        Scanner input = new Scanner(System.in); 
		
        System.out.println("Enter a number for the multiplication table:");
		int number = input.nextInt();
		
		// Array to store results
        int[] table = new int[10]; 

        // Generating the multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Displaying the table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
		
		// Closing the Scanner object
        input.close(); 
    }
}
