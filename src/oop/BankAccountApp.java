package oop;

public class BankAccountApp {
	// Create a new bank account >> think instantiate an object
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "124141412";
		//acc1.name = "Sara";
		//encapsulate
		acc1.setName("Sara");
		acc1.setSsn("13747854");
		System.out.println("SSN : "+acc1.getSsn());
		
		acc1.setRate();
		acc1.increaseRate();
		
		//System.out.println(acc1.toString());

		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "346236413";

		
		BankAccount acc3 = new BankAccount("Checking Account", 1500 );
		acc3.accountNumber = "6362646323";
		acc3.checkBalance();
		//acc3.name ="Joe";
		acc3.setName("Joe");
		//System.out.println(acc3.toString());		

		CDAccount cd1 = new CDAccount();
		//cd1.name = "Juan";
		cd1.setName("Juan");
		cd1.accountType = "CD Account";
		cd1.balance = 3000;
		cd1.accountNumber = "12423444";
		System.out.println(cd1.toString());
		cd1.compound();
		
		cd1.deposit(500);
		cd1.withdraw(100);
	
	}
}
