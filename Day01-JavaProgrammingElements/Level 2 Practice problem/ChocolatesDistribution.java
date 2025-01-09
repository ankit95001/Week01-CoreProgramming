// Create ChocolatesDistribution Class to calculate chocolate
class ChocolatesDistribution{
	public static void main(String[] args){
	
		//Storing total number of chocolates 
		int numberOfchocolates;
		
		//Storing number of studednts
		int numberOfChildren;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for number of children
		numberOfChildren=input.nextInt();
		
		//Use Scanner Object to take user input for number of chocolate
		numberOfchocolates=input.nextInt();
		
		//calculate pens each student will get
		int chocolateEachStudentGet = numberOfchocolates/numberOfChildren;
		
		//calculate non-distributed chocolate
		int remaningChocolate = numberOfchocolates%numberOfChildren;
		
		//Display the result
		System.out.println("The number of chocolates each child gets is " + chocolateEachStudentGet + " and the number of remaining chocolates are "+remaningChocolate);
		
		input.close();
	}
}