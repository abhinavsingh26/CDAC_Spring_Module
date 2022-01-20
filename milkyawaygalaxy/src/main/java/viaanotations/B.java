package viaanotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class B {
	public B()
	{
		System.out.println("B object created");
	}

}
