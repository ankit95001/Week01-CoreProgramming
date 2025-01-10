import java.util.Scanner;
//creating class SumUntilZeroUsingWhile for calculation
class SumUntilZeroUsingWhileLoop{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner sc = new Scanner(System.in);
        // Initialize sum to zero
        int sum = 0; 

        // Taking input from user and continuing the process until 0 is entered
        while (true) {
            System.out.print("Enter a Number (Enter 0 to stop) - ");
            int input = sc.nextInt();
            // Exit the loop if input is 0
            if (input == 0) {
                break; 
            }
            // Add input to sum
            sum += input; 
        }

        System.out.println("The total sum is: " + sum);
        //Close the scanner object
        sc.close();
    }
}