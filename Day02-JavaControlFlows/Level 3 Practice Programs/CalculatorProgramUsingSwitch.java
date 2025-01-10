import java.util.Scanner;
//Creating CalculatorProgramUsingSwitch class for calculation
class CalculatorProgramUsingSwitch {
    public static void main(String[] args) {
		//Creating scanner object for input
        Scanner input = new Scanner(System.in);
		
		// Taking input for the first number
        System.out.print("Enter the first number- ");
        double first = input.nextDouble();
		
		// Taking input for the second number
        System.out.print("Enter the second number- ");
        double second = input.nextDouble();
		
		// Taking input for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String operation = input.next();
		
		// Initialize validate to true
        double result = 0;
        boolean validate = true;

        // Using switch case to perform the desired operation based on the operator
        switch (operation) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Cannot divide by zero"); // Handle division by zero
                    validate = false; 
                }
                break;
            default:
                validate = false; 
                System.out.println("Invalid Operator");
                break;
        }

        // Print the result 
        if (validate) {
            System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
        }
		
		// Close the Scanner object
        input.close();
    }
}
