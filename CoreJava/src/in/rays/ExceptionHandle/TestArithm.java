package in.rays.ExceptionHandle;

public class TestArithm {
	public static void main(String[] args) {
		
	try {
		String name = "Rays";
		System.out.println("Name = "+name);
		int a =20;
		int b =0;
		
		int c =a/b;
		
		System.out.println("Division is ="+c);
	}
	
	catch(Exception e) {
	
		System.out.println("This is Exception Block");
		
	}
}
}
