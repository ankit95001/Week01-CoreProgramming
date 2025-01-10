import java.util.Scanner;
//creating NaturalAndSum class for the checking
class NaturalAndSum{
    public static void main(String[] args){
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);
		
		// Taking input for number
		System.out.print("Enter the number-");
		int number = input.nextInt();
		
        // Check if the number is a natural number
        if(number > 0){
            // Calculate the sum of the first n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of the first " + number + " natural numbers is " + sum);
        }
        else{
            System.out.println("The number is not a natural number");
        }
		
		input.close();
    }
}