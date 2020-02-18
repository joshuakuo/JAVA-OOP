package basic;

public class NumberCalc {
	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multipleNumbers(numA, numB);
		System.out.println("The product of numbers : " + numA + " and " + numB + " is " + product);
		
	}

	static void printName() {
		System.out.println("My name is Tom.");
	}
	
	static void addNumbers(int numA, int numB) {
		int sum = numA + numB;
		System.out.println("The sum of numbers : " + numA + " and " + numB + " is " + sum);
	}
	
	static int multipleNumbers(int numA, int numB) {
		int product = numA * numB;
		addNumbers(product, product);
		return product;
		
	}
}
