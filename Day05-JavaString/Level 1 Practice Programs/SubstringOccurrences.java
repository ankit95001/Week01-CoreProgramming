import java.util.Scanner;
//creating class SubstringOccurrences for checking
class SubstringOccurrences{
	public static int check(String string[],String subString){
		int occurrance = 0;
		for(String str : string){
			if(str.equals(subString)){
			occurrance++;
			}
		}
		return occurrance;
	}
	public static void main(String[] args){
		
		String string = "The name is Ankit kumar and the name is kumar is";
		
		String subString = "is";
		//calling method to get result
		int result = check(string.split(" "),subString);
		
		//printing the result
		System.out.println("Substring :"+subString+": Occurred in :"+string+" | is : "+result +" times");
		
	}
}