import java.util.Scanner; // Import Scanner for user inputs
//Creating class For Digit frequency
public class DigitFrequencyOfEveryElement {
    public static void main(String[] args) {
		// Creating Scanner object
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number:");
        int number = scanner.nextInt(); 

        // Handling negative
        if (number < 0) {
            number = Math.abs(number);
        }

        // Counting the number of digits
        int temp = number;
        int digitCount = 0;
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }
        }

        int[] digits = new int[digitCount];
        int index = 0;

        // Storing digits in the array
        if (number == 0) {
            digits[index++] = 0;
        } else {
            while (number != 0) {
                digits[index++] = number % 10;
                number /= 10;
            }
        }

        // Frequency array for digits 0-9
        int[] frequency = new int[10];

        // Calculating frequency
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Displaying frequency of each digit
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + frequency[i]);
        }
		
		// Closing the Scanner object
        scanner.close(); 
    }
}
