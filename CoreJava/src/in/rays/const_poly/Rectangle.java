package in.rays.const_poly;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
		double ar = length*width;
		System.out.println("Area of Rectangle is = "+ar);
	}

}
