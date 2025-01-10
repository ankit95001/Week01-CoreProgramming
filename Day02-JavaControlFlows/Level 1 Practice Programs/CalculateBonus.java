import java.util.Scanner;
// create class CalculateBonus for calculating the bonus
class CalculateBonus{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking as input Employee salary and service year
        System.out.print("Enter the employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the employee years of service: ");
        int yearsOfService = input.nextInt();

        // Check if the employee is eligible for the bonus
        if (yearsOfService > 5) {
            // Calculating bonus
            double bonus = salary / 20;
            System.out.println("Bonus amount is INR " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus");
        }
        //closing the scanner object
        input.close();
    }
}