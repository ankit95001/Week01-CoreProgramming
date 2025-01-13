import java.time.LocalDate;
import java.util.Scanner;
//Creating class DateArithmetic for operation
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take a date input from the user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = input.nextLine();
        LocalDate inputDate = LocalDate.parse(dateInput);

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + modifiedDate);

        // Subtract 3 weeks from the result
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);
    }
}
