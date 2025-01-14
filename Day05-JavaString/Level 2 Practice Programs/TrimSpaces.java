import java.util.Scanner;
//Creating class TrimSpaces for trim
public class TrimSpaces {
    // Method to trim spaces
    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return text.substring(start, end + 1);
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
		//Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string with spaces: ");
        String text = input.nextLine();

        String trimmedCustom = trimSpaces(text);
        String trimmedBuiltIn = text.trim();

        System.out.println("Custom Trimmed: [" + trimmedCustom + "]");
        System.out.println("Built-in Trimmed: [" + trimmedBuiltIn + "]");
        System.out.println("Are both trims equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));
		
		//Closing Scanner class object
        input.close();
    }
}
