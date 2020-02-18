package Lab2;

import java.util.List;
import java.util.ArrayList;

import oop.*;

public class Student {
	
	String name;
	String ssn;
	private static int id = 1001;
	String userID;
	String emailID;
	String phone;
	String city;
	String state;
	BankAccount acc = new BankAccount();
	List<String> courseList = new ArrayList<String>();


	// Constructor with name & ssn
	public Student() {
		System.out.println("Constructor without parameters");
	}
	
	public Student(String name, String ssn) {
		this.name = name;
		this.ssn =  ssn;
		int range = (9000 -1000) + 1;
		int r = (int) (Math.random() * range) + 1000;

		emailID = name.replace(" ", ".") + "@university.edu";		
		userID = id + "" + r + "" + ssn.substring(5);
		
	}

	public void enroll(double amount) {
	    acc.accountNumber = userID;
		acc.deposit(amount);	

		System.out.println("Student made an enrollment and made a deposit : $"+ amount);
		System.out.println("With bank account number : " + acc.accountNumber);
				
		
	}
	
	public void checkBalance() {
		acc.checkBalance();
	}
	
	public void pay(double amount) {
		acc.withdraw(amount);
		System.out.println("Payment made : $" +amount);
	}
	
	public void showCourses() {
		for (int i=0; i <courseList.size(); i++) {
			System.out.println("Courses selected : " +courseList.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "Name : " +name+ "\nEmail : " +emailID+ "\nUser ID : " +userID+ "\nPhone : " +phone+ "\nCity : " +city+ "\nState : " +state ;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}

