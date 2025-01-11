import java.util.Scanner;
//creating class LeapYearCheckerClass for checking the leap year
public class LeapYearCheckerClass {
	
	//creating method for chevking the condition
	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
	
    public static void main(String[] args) {
		
		//creating the scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();
		
		//checking fro condition and calling method as well as display the result
        if (year >= 1582 && isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
		
		//closing the scanner object
		input.close();
    }
}
