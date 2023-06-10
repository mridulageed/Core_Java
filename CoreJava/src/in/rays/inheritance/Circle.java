package in.rays.inheritance;

import in.rays.inheritance.Shape;

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
	

}
