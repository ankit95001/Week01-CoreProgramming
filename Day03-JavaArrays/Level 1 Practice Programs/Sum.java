import java.util.Scanner;
//Creating class Sum for finding the sum
public class Sum {
    public static void main(String[] args) {
		// Scanner for input
        Scanner input = new Scanner(System.in); 
		
		// Array to store up to 10 numbers
        double[] numbers = new double[10]; 
		
		// Variable to store the sum
        double total = 0.0; 
        int index = 0;

        // Loop to take input until 0 or negative is entered
        while (true) {
            double num = input.nextDouble();
            if (num <= 0 || index == 10) break;
            numbers[index++] = num;
        }

        // Summing up the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Displaying all numbers and their total
        System.out.println("The numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("The total sum is: " + total);
		
		// Closing the Scanner object
        input.close(); 
    }
}
