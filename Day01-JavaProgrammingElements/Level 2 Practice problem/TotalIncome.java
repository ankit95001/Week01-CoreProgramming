// Create TotalIncome Class to calculate
import java.util.Scanner;
class TotalIncome{

	public static void main(String[] args){
	
		//storing salary and bonus
		int salary,bonus;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for unitPrice
		salary=input.nextInt();
		
		//Use Scanner Object to take user input for quantity
		bonus=input.nextInt();
		
		//calculating total price
		int totalSalary = salary+bonus;
		

		//Display the result
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+totalSalary);
		input.close();
	}
}