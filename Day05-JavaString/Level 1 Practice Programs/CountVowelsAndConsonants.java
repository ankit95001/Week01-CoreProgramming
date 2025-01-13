//creating class CountVowelsAndConsonants for counting
class CountVowelsAndConsonants {
	public static int[] count(String string){
		int vowelCount = 0, consonantCount = 0;
		for(int i=0;i<string.length();i++){
			char ch = string.charAt(i);
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
				vowelCount++;
			}else{
				consonantCount++;
			}
		}
		
		return new int[] {vowelCount,consonantCount};
	}
	
	public static void main(String[] args){
		String string = "Abeworiusbnv";
		
		//calling method to get result
		int result[] = count(string);
		
		//Printing result
		System.out.println("The vowel count and consonant count in string "+ string+" is "+ result[0] +" and " +result[1]);
		
	}
}