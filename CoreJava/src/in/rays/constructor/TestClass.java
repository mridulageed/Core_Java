package in.rays.constructor;

public class TestClass {

	public static void main(String[] args) {
		Shape s =new Shape("Blue",200);
		Rectangle r1 =new Rectangle(30,20);
		Rectangle r2 =new Rectangle();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(20,10);
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(4.5);

	}

}
