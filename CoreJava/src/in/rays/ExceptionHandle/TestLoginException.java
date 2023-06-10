package in.rays.ExceptionHandle;

public class TestLoginException {
	public static void main(String[] args) {
		try {
			String name = "adin";
			if(name.equals("admin"))
			{
				System.out.println("Valid User!!!");
			}
			else {
				throw new LoginException();
			}
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}

}
