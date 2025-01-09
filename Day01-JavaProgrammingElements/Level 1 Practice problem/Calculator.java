// Create Calculator Class to calculate
import java.util.Scanner;
class Calculator{
	public static float add(float num1,float num2){
		return num1+num2;
    }
    public static float subtraction(float num1,float num2){
		return num1-num2;
    }
    public static float multiplication(float num1,float num2){
		return num1*num2;
    }
    public static float division(float num1,float num2){
		return num1/num2;
    }
	public static void main(String[] args){
	
		//Storing total fee and discount percentage
		float number1,number2;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for number1
		number1=input.nextFloat();
		
		//Use Scanner Object to take user input for number2
		number2=input.nextFloat();
		
		//calculating each operation
		float sum = add(number1,number2);
		
		float subtraction = subtraction(number1,number2);
		
		float multiplication = multiplication(number1,number2);
		
		float division = division(number1,number2);
		

		//Display the result
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+sum+" , "+subtraction+" , "+multiplication+" ,and "+division);
		
		input.close();
	}
}