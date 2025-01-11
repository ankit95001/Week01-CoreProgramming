import java.util.Random;
//Creating class EmployeeBonusCalculator for calculating
public class EmployeeBonusCalculator {

    // Method to generate random salary and years of service for employees
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; 

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = 1 + random.nextInt(20);
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
		
		// 2D array to store new salary, bonus, and old salary
        double[][] newEmployeeData = new double[employeeData.length][3]; 
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = 0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus for more than 5 years of service
            } else {
                bonus = oldSalary * 0.02; // 2% bonus for less than 5 years of service
            }

            // Calculate new salary
            double newSalary = oldSalary + bonus;

            // Store old salary, bonus, and new salary in new array
            newEmployeeData[i][0] = oldSalary; // old salary
            newEmployeeData[i][1] = bonus; // bonus
            newEmployeeData[i][2] = newSalary; // new salary
        }

        return newEmployeeData;
    }

    // Method to calculate the total old salary, new salary, and total bonus
    public static void calculateTotalSalariesAndBonus(double[][] employeeData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += employeeData[i][0];
            totalBonus += employeeData[i][1];
            totalNewSalary += employeeData[i][2];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonus and new salary
        double[][] newEmployeeData = calculateBonusAndNewSalary(employeeData);

        // Display results in a tabular format
        System.out.println("Employee Data (Old Salary, Bonus, New Salary):");
        System.out.println("--------------------------------------------------");
        System.out.println("Old Salary | Bonus | New Salary");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%.2f | %.2f | %.2f\n", newEmployeeData[i][0], newEmployeeData[i][1], newEmployeeData[i][2]);
        }

        // Calculate and display the total salary and bonus
        calculateTotalSalariesAndBonus(newEmployeeData);
    }
}
