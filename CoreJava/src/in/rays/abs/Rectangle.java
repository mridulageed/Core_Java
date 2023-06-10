package in.rays.abs;

public class Rectangle extends Shape{
	private int l;
	private int b;
	
	public void setLength(int l)
	{
		this.l=l;
	}
	public void setWidth(int b)
	{
		this.b=b;
	}
	
	public int getLength()
	{
		return l;
	}
	public int getWidth()
	{
		return b;
	}
	@Override
	public void area() {
		int ar = getLength()*getWidth();
		System.out.println("Area of Rectangle is = "+ar);
		
	}

}
