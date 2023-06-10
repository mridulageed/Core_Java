package in.rays.constructor;

public class Circle extends Shape{
	private double radius;
	public static final double PI = 3.14;
	
	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
		System.out.println(radius);
	}

}
