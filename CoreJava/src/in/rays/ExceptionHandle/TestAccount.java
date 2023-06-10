package in.rays.ExceptionHandle;

public class TestAccount {

	public static void main(String[] args) {
		try {
			AccountException a =new AccountException();
			a.setNumber("AB578BT");
			System.out.println(a.getNumber());
			
			a.setBalance(1000);
			//System.out.println(a.getBalance());
			
			a.deposit(600);
			System.out.println(a.getBalance());
			
			a.checkBalance();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
