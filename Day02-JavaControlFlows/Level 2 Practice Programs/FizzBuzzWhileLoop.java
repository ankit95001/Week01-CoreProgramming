import java.util.Scanner;
//creating class FizzBuzzWhileLoop for calculation
class FizzBuzzWhileLoop{
    public static void main(String[] args) {
		//Creating scanner class for the input
        Scanner input = new Scanner(System.in);

        // Taking as input
        System.out.print("Enter a number to generate FizzBuzz- ");
        int number = input.nextInt();
		
		//Check if number is less than 0
		if(number<0){
			return;
		}
		
        // Generating FizzBuzz pattern
		int sequence=0;
        while(sequence<=number){
			//Check for the condition if number is divisible by 3 and 5
			if(sequence%3==0 && sequence%5==0){
				System.out.println("FizzBuzz");
			}
			//Check for the condition if number is divisible by 3 
			else if(sequence%3==0){
				System.out.println("Fizz");
			}
			//Check for the condition if number is divisible by 5
			else if(sequence%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(sequence);
			}
			sequence++;
		}	
		//closing the scanner object
        input.close();
    }
}