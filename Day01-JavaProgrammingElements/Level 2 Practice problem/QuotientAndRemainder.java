// Creating a class for calculating Quotient and Remainder
import java.util.Scanner;
public class QuotientAndRemainder{
    public static void main(String[] args) {

        // creating a input object of Scanner class
        Scanner input = new Scanner(System.in);
      
        // creating int type first variable for taking as input
        int number1 = input.nextInt();

        // creating int type second variable for taking as input
        int number2 = input.nextInt();

        // calculating quotient and storing it in quotient variable
        int quotient = number1 / number2;

        // calculating remainder and storing it in int type variable
        int remainder = number1 % number2;

        // displaying results of quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                           " of two numbers " + number1 + " and " + number2);
    }
}