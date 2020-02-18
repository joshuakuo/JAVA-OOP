package oop;

public class BankAccount implements IRate {
	
	public String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final  >> constant  (often static final)
	private static final String routingNumber = "53453";
	
	//Instance variables
	String accountType;
	private String name;
	private String ssn;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize perperties of an object
		// 2. Constructor: are IMPLICITY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructors have no return type
	
	//Polymorphism thru overloading
	public BankAccount() {
		System.out.println("NEW ACCOUNT CREATED !!!");
	}
	
	// Overloading: call same method name with different arguments
	public BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT : " +accountType);
	}
	
	public BankAccount(String accountType, double initDeposit) {
		
		// local variables
		String errorMsg;
		
		System.out.println("NEW ACCOUNT : " +accountType);
		System.out.println("INITIAL DEPOSIT : " +initDeposit);
		if (initDeposit < 1000) {
			errorMsg = "ERROR : Minimum deposit must be at least $1,000";
			//System.out.println(errorMsg);
		} else {
			errorMsg = "Thank you for your initial deposit of $" +initDeposit;
		
		}
		System.out.println(errorMsg);
		balance = initDeposit;
	}
	
	// Interfaces
	public void setRate() {
		System.out.println("Set interest rate");
	}
	
	public void increaseRate() {
		System.out.println("Increase rate");
	}
	
	// getter/setter
	// Allow the user to define the values of the variables
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	
	}

	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;	
		System.out.println("Your recent deposit $"+amount);
		showActivities("Deposit!");

		
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;	
		System.out.println("Your recent withdraw $"+amount);
		showActivities("Withdraw!");

	}
	
	private void showActivities(String activity) {
		System.out.println("Your recent activities : " + activity);
		System.out.println("Your new balance : $" +balance);
	}
	
	public void checkBalance() {
		System.out.println("Balance is $" +balance);
		
	}

	void getStatus() {
		
	}
	
	//Overwrite
	public String toString() {
		return "[ Name " + name + ". " + accountNumber + " ." + "Routing Number " +routingNumber + ". Balance : $" + balance + " ]";
	}
}
