import java.util.Scanner;
//creating CountdownUsingWhileForRocket class for count down
class CountdownUsingWhileForRocket{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Get the countdown peak value from user
        System.out.print("Enter the peak value for countdown- ");
        int counter = input.nextInt();

        // Countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }
        //close the scanner object
        input.close();
    }
}