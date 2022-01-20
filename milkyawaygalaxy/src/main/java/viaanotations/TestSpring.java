package viaanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("viaanotations")
public class TestSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext c
		=new AnnotationConfigApplicationContext(TestSpring.class);
		
		
		
	}

}
