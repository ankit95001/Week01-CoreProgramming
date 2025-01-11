import java.util.Scanner;
//Creating class NumberCheckerHard1 for calculation
public class NumberCheckerHard1 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to check if two arrays are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseDigits(digits));
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
	
		// Create Scanner object for input
        Scanner input = new Scanner(System.in); 

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Process the number
        int[] digits = storeDigits(number);

        // Display results
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
		
		// Close the Scanner class object
        input.close(); 
    }
}
