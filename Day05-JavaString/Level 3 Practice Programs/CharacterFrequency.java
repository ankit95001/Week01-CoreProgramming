//import java.util.Scanner;
//Creating class CharacterFrequency for finding
public class CharacterFrequency {
    // Method to find the frequency of characters
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int uniqueCount = 0;

        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 0) {
                uniqueCount++;
            }
            frequency[text.charAt(i)]++;
        }

        // Create a 2D array for characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
		//Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		//calling method
        String[][] result = findCharacterFrequency(text);

        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
		
		//Closing Scanner class object
        input.close();
    }
}
