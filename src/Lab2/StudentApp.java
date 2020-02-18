package Lab2;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student("John Smith","131631245");
		Student std2 = new Student("Sara Johnson","562462456");
		
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

		//Student #2
		std2.setPhone("3453463466");
		std2.setCity("Austin");
		std2.setState("TX");

		std2.enroll(1000);

		std2.courseList.add("Geometry");
		std2.courseList.add("Chemistry");
		std2.courseList.add("Philanttropy");
		
		std2.pay(100);
		
		std2.showCourses();
		
		System.out.println(std2.toString());

		
		

		
	}
}
