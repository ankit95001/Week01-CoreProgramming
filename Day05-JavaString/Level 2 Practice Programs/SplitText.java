import java.util.Scanner;
//Creating class SplitText for splitting the word
public class SplitText {
    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    public static void main(String[] args) {
		//Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");
		
		//printing results
        System.out.println("Custom Split: " + String.join(", ", customSplit));
        System.out.println("Built-in Split: " + String.join(", ", builtInSplit));
        System.out.println("Comparison Result: " + java.util.Arrays.equals(customSplit, builtInSplit));
		
		//Closing the scanner class object
        input.close();
    }
}
