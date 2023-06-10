package in.rays.polymorphism;

public class TestClass {

	public static void main(String[] args) {
		//created an array of type Shape whose size=3
		Shape[] s = new Shape[3];
		
		//created objects of child class whose type is Shape
		s[0]= new Rectangle();
		s[1]= new Triangle();
		s[2]= new Circle();
		
		//Type-cast- shape to respective child class
		Rectangle r = (Rectangle)s[0];
	    Triangle t = (Triangle)s[1];
	    Circle c = (Circle)s[2];
	    
	    //Passes values
	    r.setLength(30);
	    r.setWidth(20);
	    
	    t.setLength(20);
	    t.setHeight(10);
	    
	    c.setRadius(5.5);
	    
	    //Executed area method of child class
	    for(int i=0;i<s.length;i++)
	    {
	    	s[i].area();
	    }

	}

}
