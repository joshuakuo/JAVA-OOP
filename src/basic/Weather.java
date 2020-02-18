package basic;

public class Weather {
	public static void main(String[] args) {
		
		int temperature = 43;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It is pleasant.  Wear shorts and shirt");
		} else if (temperature >60 && sunCondition == "Sunny") {
			System.out.println("It is a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		} else if (temperature >50 || sunCondition  == "Overcast") {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		
		} else {
			System.out.println("Looks like a cold day. Bring a sweater. ");
		}
		
		System.out.println("The program is ending.");
	}

}
