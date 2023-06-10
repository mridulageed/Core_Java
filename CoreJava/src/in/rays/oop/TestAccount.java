package in.rays.oop;

public class TestAccount {

	public static void main(String[] args) {
		Account a =new Account();
		a.setNumber("SBI12345");
		System.out.println(a.getNumber());
		
		a.setAccountType("Savings");
		System.out.println(a.getAccounttype());
		
		a.setBalance(2000);
		a.deposit(120);
		
		a.withdrawal(100);
		
		

	}

}
