import java.util.Scanner;
//Creating class CheckAnagram for checking
public class CheckAnagram {
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
        // Take input for two strings
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();
        
        // Sort both strings and compare
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();
            
            // Sorting both strings
            java.util.Arrays.sort(str1Array);
            java.util.Arrays.sort(str2Array);
            
            // Compare sorted arrays
            if (java.util.Arrays.equals(str1Array, str2Array)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}

