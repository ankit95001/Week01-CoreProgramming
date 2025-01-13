//creating class PalindromeChecker for checking
class PalindromeChecker{
	public static boolean check(String string){
		boolean flag = true;
		for(int i=0;i<string.length()/2;i++){
			if(string.charAt(i) != string.charAt(string.length()-i-1)){
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args){
		
		String string = "adba";
		
		//calling method to get result
		boolean result = check(string);
		
		//printing the result
		System.out.println("Is Palindrome "+string+" is : "+result);
		
	}
}