import java.util.Scanner;
//Creating class CheckArmstrongNumber for checking
public class CheckArmstrongNumber {
    public static void main(String[] args) {
        //Creating scanner object for input		
        Scanner input = new Scanner(System.in);
		
		//Taking input
        int number = input.nextInt();

		//taking total sum as 0
        int sum = 0;
		
        int tempNumber = number;

        // Use while loop till the temp Number is not equal to zero
        while (tempNumber != 0) {
            //Find the remainder of the number (last digit)
            int remainder = tempNumber % 10;

            //Find the cube of the digit and add it to the sum
            sum += remainder * remainder * remainder;

            //Find the quotient and assign it to the tempNumber
            tempNumber /= 10;
        }

        // Check if the sum and the original number are the same
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
		//close the scanner object
		input.close();
    }
}