package annotations;

@CustomAnnotation(version = 10)
public class B extends A {
	
	@Override
	public void showLastUserLogin() {
		System.out.println("showing user info, in class B!");
	}
	
	@Deprecated
	public void show() {
		System.out.println("in class B!");
	}
}
