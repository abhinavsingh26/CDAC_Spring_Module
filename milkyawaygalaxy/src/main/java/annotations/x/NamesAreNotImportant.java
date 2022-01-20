package annotations.x;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("annotations.y")
public class NamesAreNotImportant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac
		=new AnnotationConfigApplicationContext(NamesAreNotImportant.class);
		
		
	}

}
