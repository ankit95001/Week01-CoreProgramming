import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
       
        // Declare variables a, b, c of double data type
        double a, b, c;

        // taking value of a, b, and c from user
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        // Perform the operations and assign results to variables
        double result1 = a + b * c;      
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Print the results
        System.out.println("The results of Double Operations are "+result1+" , "+result2+" , "+result3+" , "+result4);
        scanner.close();
    }
}