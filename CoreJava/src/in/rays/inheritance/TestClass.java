package in.rays.inheritance;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Triangle t = new Triangle();
		
		//Shape
		s.setColor("Blue");
		System.out.println(s.getColor());
		s.setBorderWidth(10);
		System.out.println(s.getborderwidth());
		System.out.println();
		
		//Rectangle
		r.setColor("Red");
		System.out.println(r.getColor());
		r.setBorderWidth(15);
		System.out.println(r.getborderwidth());
		r.setLength(20);
		System.out.println(r.getLength());
		r.setWidth(10);
		System.out.println(r.getwidth());
		System.out.println("");
		
		//Circle
		c.setColor("Yellow");
		System.out.println(r.getColor());
		c.setBorderWidth(20);
		System.out.println(r.getborderwidth());
		c.setRadius(8.2);
		System.out.println(c.getRadius());
		System.out.println("");
		
		//Triangle
		t.setColor("Orange");
		System.out.println(t.getColor());
		t.setBorderWidth(25);
		System.out.println(t.getborderwidth());
		t.setBase(30);
		System.out.println(t.getBase());
		t.setHeight(20);
		System.out.println(t.getHeight());
		System.out.println("");
		

	}

}
