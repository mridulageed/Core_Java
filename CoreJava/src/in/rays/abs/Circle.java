package in.rays.abs;

public class Circle extends Shape{
	private double radius;
	public static final double PI=3.14;
	
	private double r;
	
	
	public void setRadius(double r)
	{
		this.r=r;
	}
	
	public double getRadius()
	{
		return r;
	}
	
	@Override
	public void area() {
		
		double ar = PI*getRadius()*getRadius();
		System.out.println("Area of Circle is= "+ar);
		
	}

	
	
	

}
