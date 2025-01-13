import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//Creating class DateFormatting for formatting
public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format 1
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date in format dd/MM/yyyy: " + currentDate.format(format1));

        // Format 2
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Date in format yyyy-MM-dd: " + currentDate.format(format2));

        // Format 3
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Date in format EEE, MMM dd, yyyy: " + currentDate.format(format3));
    }
}
