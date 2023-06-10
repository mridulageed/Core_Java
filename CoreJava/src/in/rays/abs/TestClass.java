package in.rays.abs;

public class TestClass {

	public static void main(String[] args) {
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Circle s3 = new Circle();
		
		s1.setLength(30);
		s1.setWidth(20);
		
		s2.setBase(20);
		s2.setHeight(10);
		
		s3.setRadius(5.5);
		
		s1.area();
		s2.area();
		s3.area();
		
		//Shape s= new Rectangle();
		//s.area();

	}

}
