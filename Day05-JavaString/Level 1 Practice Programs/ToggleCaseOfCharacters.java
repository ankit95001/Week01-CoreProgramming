import java.util.Scanner;
//creating class ToggleCaseOfCharacters for toggle
class ToggleCaseOfCharacters{
	public static String check(char string[]){
		StringBuffer result = new StringBuffer("");
		for(char ch : string){
			if(ch >= 65 && ch <=90){
				result.append(Character.toLowerCase(ch));
			}else{
				result.append(Character.toUpperCase(ch));
			}
		}
		return result.toString();
	}
	public static void main(String[] args){
		
		String string = "Ankit Kumar";

		//calling method to get result
		String result = check(string.toCharArray());
		
		//printing the result
		System.out.println("After Toggel case of string"+ string+"is :"+result );
		
	}
}