import java.util.Scanner;
//Creating class VowelsConsonants for finding
public class VowelsConsonants {
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) >= 0) vowels++;
                else consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int[] result = countVowelsConsonants(text);
		
		//Printing result
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
		
		//Closing Scanner class object
        input.close();
    }
}
