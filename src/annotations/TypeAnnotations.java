package annotations;

import java.lang.annotation.Annotation;

@SuppressWarnings("unused")
public class TypeAnnotations {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		B obj = new B();
		obj.showLastUserLogin();
		obj.show();
		
		// Using Custom annotationi
//		Class c = obj.getClass();
//		Annotation an = c.getAnnotation(CustomAnnotation.class);
//		CustomAnnotation s = (CustomAnnotation)an;
//		System.out.println(s.os() + s.version());
		
	}

}
