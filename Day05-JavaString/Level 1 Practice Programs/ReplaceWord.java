import java.util.Scanner;
//Creating class ReplaceWord for replacing
public class ReplaceWord {
	public static String replacement(String sentence, String wordToReplace, String replacementWord){
		return sentence.replace(wordToReplace, replacementWord);
	}
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
        // Take input for sentence, word to replace, and replacement word
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String wordToReplace = input.nextLine();
        
        System.out.print("Enter the replacement word: ");
        String replacementWord = input.nextLine();
        
        // Replace occurrences of the word
        String result = replacement(sentence, wordToReplace, replacementWord);
        
        // Output the modified sentence
        System.out.println("Modified Sentence: " + result);
    }
}
