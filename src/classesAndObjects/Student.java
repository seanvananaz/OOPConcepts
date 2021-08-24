package classesAndObjects;

public class Student {
	String firstname;
	String lastname;
	int age;
	
	void displayInfo() {
		System.out.println(
			"Firstname: " + this.firstname + "\n" +
			"Lastname: " + this.lastname + "\n" +
			"Age: " + this.age				
		);
	}
}

//public Student() {
//	this.firstname = "";
//	this.lastname = "";
//	this.age = 1;
//}

//Student(String fname, String lname, int age) {
//	this.firstname = fname;
//	this.lastname = lname;
//	this.age = age;
//}
