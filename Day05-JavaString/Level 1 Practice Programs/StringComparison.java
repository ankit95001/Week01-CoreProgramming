import java.util.Scanner;
//Creating class StringComparison for comparison
public class StringComparison {
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in); 

        // Taking input for two strings
        System.out.print("Enter first string: ");
        String str1 = input.next();
        System.out.print("Enter second string: ");
        String str2 = input.next();

        // Comparing strings using charAt() method
        boolean resultCharAt = compareUsingCharAt(str1, str2);
        System.out.println("Comparison using charAt(): " + resultCharAt);

        // Comparing strings using equals() method
        boolean resultEquals = str1.equals(str2);
        System.out.println("Comparison using equals(): " + resultEquals);
		
		//closing scanner class object
        input.close();
    }
}
