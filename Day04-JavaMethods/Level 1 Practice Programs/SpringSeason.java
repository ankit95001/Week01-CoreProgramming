import java.util.Scanner;
//creating class SpringSeason for check
public class SpringSeason {

	//creating method for check
	static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 || month == 4 || month == 5 || month == 6 && day <= 20) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
	
		//creating the scanner object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input for month
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
		
		//Taking input for day
        System.out.print("Enter day: ");
        int day = input.nextInt();
		
		//calling method for checking
        boolean isSpring = isSpringSeason(month, day);
		
		//Checking condition
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
		
		//closing the scanner object
		input.close();
    }
}
