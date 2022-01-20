package annotations.y;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Freaky {
	
	public Freaky()
	{
		System.out.println("Freaky constructo called");
	}
	
	
	@Autowired
	public void nobodyCares(Junk j)
	{
		System.out.println("junk object is given as input by spring");
		
		
	}

}
