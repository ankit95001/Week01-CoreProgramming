import java.util.Scanner;
//creating class LongestWord for checking
class LongestWord{
	public static String check(String string[]){
		int longestLength = 0;
		int index=0;
		for(int i=0;i<string.length;i++){
			if(string[i].length()>longestLength){
				longestLength=string[i].length();
				index=i;
				
			}
		}
		return string[index];
	}
	public static void main(String[] args){
		
		//Creting scanner class object for input
		Scanner input = new Scanner(System.in);
		String string = input.nextLine().trim();
		
		//calling method to get result
		String result = check(string.split(" "));
		
		//printing the result
		System.out.println("Longest word in :"+string+" | is : "+result);
		
	}
}