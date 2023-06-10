package in.rays.const_poly;

public class Circle extends Shape{
	private double radius;
	public static final double PI=3.14;
	
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
		double arr = PI*radius*radius;
		System.out.println("Area of Circle is = "+arr);
	}

}
