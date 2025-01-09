// Creating class for Swapping numbers
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        // creating object for scanner
        Scanner input = new Scanner(System.in);
        //input for the numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        input.close();
    }
}