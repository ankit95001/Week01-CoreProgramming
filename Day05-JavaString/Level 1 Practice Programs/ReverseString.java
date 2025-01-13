// creating class ReverseString for reverse the string
class ReverseString{
	public static String reverseMethod(String string){
		StringBuffer result = new StringBuffer("");
		for(int i=string.length()-1;i>=0;i--){
			result.append(string.charAt(i));
		}
		
		return result.toString();
	}
	public static void main(String[] args){
		
		String string = "abcd";
		
		//calling method to get result
		String result = reverseMethod(string);
		
		//printing the result
		System.out.println("The reverse of string "+string+" is : "+result);
		
	}
}