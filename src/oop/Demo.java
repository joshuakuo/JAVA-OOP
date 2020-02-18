package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is working");
	}
	
	void eat() {
		System.out.println(name + " is eating");
		
	}
	
	void email() {
		System.out.println(email);
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "9876543211";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sara";
		person2.email = "sara@testemail.com";
		person2.phone = "5314887562";
		
		person2.eat();
		
		
		/*
		// Person
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "9876543211";

		walking(name);
		System.out.println(name + " is eating");
		
		// another person
		String name2 = "Sara";
		String email2 = "sara@testemail.com";
		String phone2 = "5436543211";

		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together
		*/
	}
	
	/*
	static void walking(String name) {
		System.out.println(name + " is working");
	}
	*/
}
