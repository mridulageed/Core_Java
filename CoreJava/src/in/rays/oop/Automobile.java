package in.rays.oop;

public class Automobile {
	private String color=null;
	private int speed = 0;
	private String make = null;
	private static final int NO_OF_GEARS = 4;
	
	//Getter Setter methods for color
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	
	//Getter Setter methods for make
	public void setMake(String make)
	{
		this.make=make;
	}
	public String getMake()
	{
		return make;
	}
	
	public void changeGear(int gear)
	{
		System.out.println("Gear Changed to "+gear);
		
	}
	
	//Getter Setter methods for speed
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	
	public void getSpeed(int s)
	{
		System.out.println("Speed is = "+s);
	}
	
	
	public void accelerator(int sp)
	{
		int total = speed +sp;
		System.out.println("Now the speed is "+total);
	}
	
	public void brake(int b)
	{
		int total = speed - b;
		System.out.println("Now the speed is "+total);
	}

}
