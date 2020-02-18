package Lab2;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student("John Smith","131631245");
		
		//std1.setName("John Smith");
		//std1.setSsn("131631245");
		std1.setPhone("3112445463");
		std1.setCity("Dallas");
		std1.setState("TX");
		
		std1.enroll(1000);

		std1.courseList.add("Math");
		std1.courseList.add("Algebra");
		std1.courseList.add("Social Study");
		
		std1.pay(100);
		
		std1.showCourses();
		
		System.out.println(std1.toString());
		//System.out.println("email ID : " +std1.emailID);
		//System.out.println("User ID : " +std1.userID);

		
		//Records rd1 = new Records();

		
	}
}
/*
class  Student {
		
		String name;
		String ssn;
		private static int id = 1001;
		String userID;
		String emailID;

		// Constructor with name & ssn
		public Student(String name, String ssn) {
			this.name = name;
			this.ssn =  ssn;
			int range = (9000 -1000) + 1;
			int r = (int) (Math.random() * range) + 1000;
  
			emailID = name.replace(" ", ".") + "@university.edu";		
			userID = id + "" + r + "" + ssn.substring(5);
			
		}

		public void enroll() {
			
		}
		
		public void checkBalance() {
			
		}
		
		@Override
		public String toString() {
			return "Name : " +name+ "\nEmail : " +emailID+ "\nUser ID : " +userID;
		}
		
		public void showCourses() {
			
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
				
}
*/
