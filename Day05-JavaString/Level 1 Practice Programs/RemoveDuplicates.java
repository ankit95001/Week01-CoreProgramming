//creating class RemoveDuplicates for checking
class RemoveDuplicates{
	public static String check(String string){
		int freq[] = new int[256];
		StringBuilder result = new StringBuilder("");
		for(char c : string.toCharArray()){
			if(freq[c] == 0){
				result.append(c);
				
				freq[c]++;
			}
		}
		
		return result.toString();
	}
	public static void main(String[] args){
		
		String string = "aabba";
		
		//calling method to get result
		String result = check(string);
		
		//printing the result
		System.out.println("After removing duplicate from "+string+" is : "+result);
		
	}
}