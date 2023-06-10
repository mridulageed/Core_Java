package in.rays.polymorphism;

public class Triangle extends Shape{
	private double length;
	private double height;
	
	public void setLength(double length)
	{
		this.length=length;	
	}
	
	public double getLength()
	{
		return length;
		
	}
	
	public void setHeight(double height)
	{
		this.height=height;	
	}
	
	public double getHeight()
	{
		return height;
		
	}
	
	public double area()
	{
		double ar = (getLength()* getHeight())/2;
		System.out.println("Area of Triangle is = "+ar);
		return 0;
		
	}

}
