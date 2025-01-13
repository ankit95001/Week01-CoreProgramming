import java.util.Scanner;
//Creating class RemoveCharacter for removing
public class RemoveCharacter {
	public static String remove(String str, char charToRemove){
		StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result.append(str.charAt(i));
            }
        }
		return result;
	}
    public static void main(String[] args) {
		//Creating scanner class method for input
        Scanner input = new Scanner(System.in);
        
        // Take input for string and character to remove
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        
        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);
        
        // calling method
		String result = remove(str, charToRemove);
        
        
        // Output the modified string
        System.out.println("Modified String: \"" + result.toString() + "\"");
    }
}
