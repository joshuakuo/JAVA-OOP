package basic;

public class FactorialsApp {

	public static void main(String[] args) {
		// Factorials
		// fact(1) = 1 * 1 = 1
		// fact(2) = 1 * 2 = 2
		// fact(3) = 1 * 2 * 3 = 6
		// fact(4) = 1 * 2 * 3 * 4 = 24
		
		System.out.println(fact(5));
	}	
	
	public static int fact(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;			
		} else {
			return fact(n-1) * n;
		}
			
	}
		
}
