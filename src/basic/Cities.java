package basic;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"New York", "San Franscisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String[] countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
			

		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		
		int i = 0;
		do {
			
		System.out.println(states[i]);
		
			i++;
		} while (i <5);
		
		int n= 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			if (state == "Texas") {
				System.out.println("STATE FOUND");
				stateFound = true;
			}
			System.out.println("STATE at " + n + " ; " + states[n]);
			n++;
		}
		
		for (int x =0; x<5; x++) {
			System.out.println(states[x]);
		}
		

	}

}
