import java.util.Scanner;
//Creating class FirstNonRepeatingCharacter for finding
public class FirstNonRepeatingCharacter {
    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // ASCII size

        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		//calling method
        char result = findFirstNonRepeatingCharacter(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
		
		//Closing scanner class object
        input.close();
    }
}
