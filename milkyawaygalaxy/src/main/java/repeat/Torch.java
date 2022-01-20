package repeat;

public class Torch {
	
	private Bulb b;
	private AAA battery;
	
	public Torch()
	{ 
		b=new Bulb();
		
	}
	
	public void setBattery(AAA x)
	{
		System.out.println("battery put inside the torch");
		 battery =x;
	}

	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Torch is on " 
		+ b.bulb() + " using battery" 
		+ battery.getBrandName());
		
	}
	
	
	
	

}
