import java.util.Scanner;
//Creating class Multiplication for multiplication
public class Multiplication {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner input = new Scanner(System.in); 
		
        System.out.println("Enter a number for the multiplication table:");
        int number = input.nextInt();
        int[] results = new int[4];

        // Generating multiplication tables from 6 to 9
        for (int i = 6; i <= 9; i++) {
            results[i - 6] = number * i; 
        }

        // Displaying the results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[i - 6]);
        }
		//close the scanner object
        input.close();
	}
}