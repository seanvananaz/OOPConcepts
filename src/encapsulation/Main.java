package encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Mark Dave");
		e.setAge(16);
		
		System.out.println("Name: " + e.getName());
		System.out.println("Age: " + e.getAge());
	}

}
