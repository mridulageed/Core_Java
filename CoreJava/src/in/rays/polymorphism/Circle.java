package in.rays.polymorphism;

public class Circle extends Shape{
	private double radius;
	public static final double PI = 3.14;
	
	public void setRadius(double radius)
	{
		this.radius=radius;	
	}
	
	public double getRadius()
	{
		return radius;
		
	}
	
	
	
	public double area()
	{
		double ar = PI *getRadius()* getRadius();
		System.out.println("Area of Circle is = "+ar);
		return 0;
		
	}

}
