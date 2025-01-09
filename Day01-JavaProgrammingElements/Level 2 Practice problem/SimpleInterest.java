// Creating class for calculation of Simple Interest
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);

        //Input for principal
        double principal = input.nextDouble();

        //input for rate
        double rate = input.nextDouble();

        //input for time
        double time = input.nextDouble();
		// calculating the simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + ", Rate of Interest " + rate + 
                           ", and Time " + time);
    }
}