import java.util.Scanner;
// Creating class NumberChecker for checking
public class NumberChecker {

    // Method to count digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        while (number > 0) {
            if (number % 10 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
	
		// Create Scanner object
        Scanner input = new Scanner(System.in); 

        // Input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count digits
        System.out.println("Total digits: " + countDigits(number));

        // Check duck number
        System.out.println("Is duck number: " + isDuckNumber(number));

        // Check Armstrong number
        System.out.println("Is Armstrong number: " + isArmstrongNumber(number));

        // Find largest and second largest digits
        int[] digits = getDigitsArray(number);
        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestValues[0]);
        System.out.println("Second largest digit: " + largestValues[1]);

        // Find smallest and second smallest digits
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestValues[0]);
        System.out.println("Second smallest digit: " + smallestValues[1]);
		
		// Close the scanner class object
        input.close(); 
    }
}