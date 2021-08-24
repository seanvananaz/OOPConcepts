package classesAndObjects;

public class StudentsInfo {

	public static void main(String[] args) {
		Student s = new Student();
		s.firstname = "Mark";
		s.lastname = "Dave";
		s.age = 15;
		
		s.displayInfo();

//		Student s = new Student();
//		s.firstname = "Mark";
//		s.lastname = "Dave";
//
//		Student t = new Student("mark", "dave", 16);
//		
//		s.displayInfo();
//		t.displayInfo();
	}

}
