import java.util.Scanner;
//Creating EmployeeBonusCalculation for calculation
public class EmployeeBonusCalculation {
    public static void main(String[] args) {
		//Creating the Scanner object for input
        Scanner input = new Scanner(System.in);
		
		// creating the array for salary, yearOfService, bonus, newSalary
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking inputs for salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the salary and years of service for employee " + (i + 1) + ":");
            salary[i] = input.nextDouble();
            yearsOfService[i] = input.nextDouble();

            if (salary[i] < 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please re-enter values.");
                i--; 
            }
        }

        // Calculating bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying results
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
		
		//closing the scanner object
        input.close();
    }
}
