package basic;

public class Homeworks {

	public static void main(String[] args) {
		
		int i =1;
		
		System.out.println(sum(i));
	
	}
	
	public static int sum(int n){

		int i=1;

		while(i<=n){

		i+=i++;

		}
		return i;
	}
}
