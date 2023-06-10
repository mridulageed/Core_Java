package in.rays.ExceptionHandle;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			
		int a,b;
		String name= "Rays";
		a=15;
		b=0;
		
		
		System.out.println(name.charAt(10));
		//System.out.println(c);
		int c = a/b;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
			
		
		 catch (Exception e) {
			
			System.out.println(e);
		}
		finally {
			System.out.println("This is final block");
		}
		
	}
	
}
