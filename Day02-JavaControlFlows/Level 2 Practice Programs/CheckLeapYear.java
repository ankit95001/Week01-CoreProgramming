import java.util.Scanner;
//creating CheckLeapYear class for checking leap year
public class CheckLeapYear{
    public static void main(String[] args) {
		//Creating scanner object 
        Scanner input = new Scanner(System.in);
		
		//Taking input for year
        System.out.print("Enter a year(>= 1582): ");
        int year = input.nextInt();

        // Check if the year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("The year " + year + " is before the Gregorian calendar started.");
        } else {
            // Check if the year is a leap year using multiple conditions
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }

        input.close();
    }
}