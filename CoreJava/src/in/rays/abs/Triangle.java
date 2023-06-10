package in.rays.abs;

public class Triangle extends Shape {
	private double b;
	private double h;
	
	public void setBase(double b)
	{
		this.b=b;
	}
	public void setHeight(double h)
	{
		this.h=h;
	}
	
	public double getBase()
	{
		return b;
	}
	public double getHeight()
	{
		return h;
	}
	@Override
	public void area() {
		
		double ar= (getBase()*getHeight())/2;
		System.out.println("Area of Triangle is = "+ar);
	}

}
