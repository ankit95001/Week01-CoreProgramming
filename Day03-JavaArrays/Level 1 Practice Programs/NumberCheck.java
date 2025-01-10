import java.util.Scanner;
//Creating class NumberCheck class for check numbers
public class NumberCheck {
    public static void main(String[] args) {
		// Scanner object for input
        Scanner input = new Scanner(System.in); 
		
		// Array to store 5 numbers
        int[] numbers = new int[5]; 

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Checking for each number
        for (int num : numbers) {
            if (num > 0) {
                System.out.print("Positive and ");
                if (num % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Comparing first and last elements
        if (numbers[0] > numbers[numbers.length - 1]){
            System.out.println("The first number is greater than the last number.");
        } 
		else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first number is less than the last number.");
        } 
		else {
            System.out.println("The first and last numbers are equal.");
        }
		
		// Closing the Scanner object
        input.close(); 
    }
}
