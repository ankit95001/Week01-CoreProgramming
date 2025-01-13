import java.time.LocalDate;
import java.util.Scanner;
//Creating class DateComparison for comparison
public class DateComparison {
    public static void main(String[] args) {
	
	//creating scanner class object for input
        Scanner input = new Scanner(System.in);

        // Take two date inputs from the user
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = input.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = input.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
