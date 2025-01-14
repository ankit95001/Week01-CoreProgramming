import java.util.Scanner;
import java.util.Random;
//creating class NumberGuessingGame for 
public class NumberGuessingGame {
    public static void main(String[] args) {
		//Creating scanner class for input
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100 :");
		while (!guessedCorrectly) {
            int guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'low', 'high', or 'correct': ");
            String feedback = input.nextLine().toLowerCase();

            if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it!");
                guessedCorrectly = true;
            } else {
                System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }
        }
    }
}
