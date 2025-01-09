import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
		
        // Declare variables a, b, c of int data type
        int a, b, c;

        // taking value of a, b, and c from user
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        // Perform the operations and assign results to variables
        int result1 = a + b * c;       
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Print the results
        System.out.println("The results of Int Operations are "+result1+" , "+result2+" , "+result3+" , "+result4);
        scanner.close();
    }
}