
public class Employee {

	public static void main(String[] args) {
		int [] nums = new int[5];
		
		try {
			System.out.println("in Try");
			nums[11] = 6;
		} catch (Exception ex) {
			System.out.println("in Catch: " + ex);
			return;
		} finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Rest of the code");
	}

}
