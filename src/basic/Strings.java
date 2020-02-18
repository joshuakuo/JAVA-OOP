package basic;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String booktitle;
		String wordChoice = "Ring";
		booktitle = "The Lord of the Ring";
		
		
		if (booktitle.contains("Ring")) {
			System.out.println("The book contains the word "+ wordChoice);
			
		}
		
		String browser = "Chrome";
		//if (browser == "Chrome") {
			
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("This is ignore Case string is true");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String ssn = "123456789";
		
		System.out.println("There are " + ssn.length() + " digits in your SSN.");
		
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,3));
		System.out.println(ssn.substring(5));
		
	}

}
