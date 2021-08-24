package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Meta Annotation
@Target(ElementType.TYPE) 	// level of annotation e.g. class, method, field...
@Retention(RetentionPolicy.RUNTIME)  // till what point annotation will work
@interface CustomAnnotation { // Marker Annotation
	String os() default "WINDOWS"; // Single Annotation
	int version() default 1; // Multi Value Annotation
}
