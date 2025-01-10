import java.util.Scanner;
//creating class ReverseNumberOfArray for reverse array
public class ReverseNumberOfArray {
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int count = 0;
        int temp = number;

        // Counting digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;

        // Storing digits in the array
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Displaying digits 
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

		//close the scanner object
        input.close();
    }
}
