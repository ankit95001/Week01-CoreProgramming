import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {

        //Creating scanner class for taking input
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number - ");
		int number = input.nextInt();

		boolean divisibleByFive;
		
        // Checking if the number is divisible by 5
        if (number % 5 == 0) {
            divisibleByFive = true;
        } else {
            divisibleByFive = false;
        }
		System.out.println("Is the number " + number + " divisible by 5? " + divisibleByFive);
		input.close();
    }
}