import java.util.Scanner;
// Creating class LargestDigitsOfArray for calculation
public class LargestDigitsOfArray {
    public static void main(String[] args) {
		//creating scanner class for input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int[] digits = new int[10];
        int index = 0;

        // Storing digits in the array
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
            if (index == 10) 
				break;
        }

        // Finding the largest and second-largest digits
        int largest = -1, secondLargest = -1;
		
		//Apply loops
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
		
		//close the scanner object
        input.close();
    }
}
