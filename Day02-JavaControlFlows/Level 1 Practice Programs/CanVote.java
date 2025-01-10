import java.util.Scanner;
//creating CanVote class for check
class CanVote{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking age as input
        System.out.print("Enter the person's age: ");
        // Store the input in the age variable
        int age = input.nextInt(); 

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }
        input.close();
    }
}