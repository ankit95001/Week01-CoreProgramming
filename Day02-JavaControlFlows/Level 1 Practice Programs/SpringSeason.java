import java.util.Scanner;
//creating SpringSeason class for check
class SpringSeason {
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // taking day and month from user as input
        System.out.print("Enter month- ");
        int month = input.nextInt();
        System.out.print("Enter day- ");
        int day = input.nextInt();

        // Check if the date 
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        //Close the scanner object
        input.close();
    }
}