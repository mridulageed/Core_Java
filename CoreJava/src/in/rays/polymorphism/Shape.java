package in.rays.polymorphism;

public class Shape {
	private String color;
	private double borderwidth;
	
	public void setColor(String color)
	{
		this.color=color;	
	}
	
	public String getColor()
	{
		return color;
		
	}
	
	public void setBorderWidth(double borderwidth)
	{
		this.borderwidth=borderwidth;	
	}
	
	public double getBorderWidth()
	{
		return borderwidth;
		
	}
	
	public double area()
	{
		return 0;
		
	}

}
