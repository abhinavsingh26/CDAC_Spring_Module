package viaanotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	
	public A()
	{
		System.out.println("A object created");
	}
	
	
	//to call the function we need an object of class A
	// object of Class B/
	//why .. setS function is non static in A and its
	//input argument is of type B.
	
	@Autowired
	public void setHell(B obj)
	{		
		System.out.println("setHell called");
	}

}
