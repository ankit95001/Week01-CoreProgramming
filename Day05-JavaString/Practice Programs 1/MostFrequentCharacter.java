import java.util.Scanner;
//Creating class MostFrequentCharacter for finding
public class MostFrequentCharacter {
	public static char mostFrequent(String str){
		// Initialize variables to track the most frequent character
        char mostFrequentChar = '\0';
        int maxCount = 0;
        
        // Check frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            
            // Count occurrences of currentChar
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            // Update the most frequent character
            if (count > maxCount) {
                mostFrequentChar = currentChar;
                maxCount = count;
            }
        }
		return mostFrequentChar;
	}
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
        // Take input for the string
        System.out.print("Enter the string: ");
        String str = input.nextLine();
		
		//calling method for result
		char result = mostFrequent(str);
        
        
        // Output the result
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
