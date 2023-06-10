package in.rays.ExceptionHandle;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dad();

	}
	
	public static void dad()
	{
	    System.out.println("Dad");
	    try {
			mom();
		} catch (AajBachGaye e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void mom() throws AajBachGaye
	{
		System.out.println("Mom");
		son();
	}
	public static void son() throws AajBachGaye {
		System.out.println("Son");
		throw new AajBachGaye();
	}

}
