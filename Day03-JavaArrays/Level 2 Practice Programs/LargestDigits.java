import java.util.Scanner;
//Creating class LargestDigits for implementation
public class LargestDigits {
    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Storing digits at runtime
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase the size of the array
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        // Finding the largest and second-largest digits
        int largest = -1, secondLargest = -1;
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
		
		//closing the scanner obejct
        input.close();
    }
}
