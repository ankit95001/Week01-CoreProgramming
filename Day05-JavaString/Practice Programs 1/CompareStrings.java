import java.util.Scanner;
//Creating class CompareStrings for comparision
public class CompareStrings {
	public static int compareStrings(String str1,String str2){
		// Compare the two strings lexicographically
        int result = 0;
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                result = -1;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                result = 1;
                break;
            }
        }
        
        // Handle case where one string is a prefix of the other
        if (result == 0) {
            if (str1.length() < str2.length()) {
                result = -1;
            } else if (str1.length() > str2.length()) {
                result = 1;
            }
        }
		return result;
	}
    public static void main(String[] args) {
		//Creating scanner class object
        Scanner input = new Scanner(System.in);
        
        // Take input for two strings
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();
		
		//calling methods
        int result = compareStrings(str1,str2);
        
        // Output the result
        if (result == -1) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result == 1) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
