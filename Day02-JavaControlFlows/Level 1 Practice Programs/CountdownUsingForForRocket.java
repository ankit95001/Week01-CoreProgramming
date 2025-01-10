import java.util.Scanner;
//creating CountdownUsingForForRocket class for count down
class CountdownUsingForForRocket{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Get the countdown peak value from user
        System.out.print("Enter the peak value for countdown- ");
        int counter = input.nextInt();

        // Countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        //close the scanner object
        input.close();
    }
}