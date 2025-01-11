import java.util.Scanner;
//Creating class NumberCheckerHard for Checking
public class NumberCheckerHard {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int[] digits = new int[countDigits(number)];
        int index = digits.length - 1;
        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to calculate sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to calculate sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to calculate frequency of digits
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Assign the digit
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
		
		// Create Scanner object for input
        Scanner input = new Scanner(System.in); 

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Process the number
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        int sumSquares = sumOfSquares(digits);

        // Display results
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + sumSquares);
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, sum));

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
            }
        }
		
		// Close the Scanner class object
        scanner.close(); 
    }
}
