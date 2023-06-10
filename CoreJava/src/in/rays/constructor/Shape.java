package in.rays.constructor;

public class Shape {
	private String color;
	private int borderwidth;
	
	public Shape()
	{
		
	}
	
	public Shape(String color)
	{
		this.color = color;
		System.out.println(color);
	}
	
	public Shape(int borderwidth)
	{
		this.borderwidth= borderwidth;
	}
	
	public Shape(String color, int borderwidth)
	{
		this.color=color;
		this.borderwidth=borderwidth;
		System.out.println(color);
		System.out.println(borderwidth);
	}
}

