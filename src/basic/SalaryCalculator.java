package basic;

public class SalaryCalculator {
	public static void main(String[] args) {
		
		// Career
		String career;
		
		System.out.println("Program is starting");
		career = "Software Developer";
		
		System.out.println("My career is : " + career);
		
		int hourPerWeek = 40;
		int weekPerYear = 52;
		double rate = 42.50;
		
		double salary = hourPerWeek * weekPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of " + rate + " per hour is $" + salary + " per year.");
	}
	
}
