package in.rays.const_poly;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle()
	{
		
	}
	
	public Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
		double ar = (base*height)/2;
		System.out.println("Area of Triangle is = "+ar);
	}


}
