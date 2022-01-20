package repeat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext c =
				new ClassPathXmlApplicationContext("abc.xml");
		
		Torch t =c.getBean(Torch.class);
		t.on();
		
		
	}

}
