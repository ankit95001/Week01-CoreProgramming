import java.util.Scanner;
//creating class OddOrEven for check
public class OddOrEven{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking user input using scanner
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Iterate from 1 to the number and check odd/even
            for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is an even number");
                } else {
                    System.out.println(currentNumber + " is an odd number");
                }
            }
        }
        input.close();
    }
}