import java.util.Scanner;
//Creating class PalindromeChecker for checking
public class PalindromeChecker {
	public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String str = input.nextLine();
		
		//Calling method and checking
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
