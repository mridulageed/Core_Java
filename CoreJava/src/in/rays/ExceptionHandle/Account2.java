package in.rays.ExceptionHandle;

public class Account2 extends Exception{
	private int balance=0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amt) {
		int total = getBalance()+ amt;
		System.out.println("Balance is ="+total);
		setBalance(total);
	}
	
	public void withdraw(int amt)
	{
		int total = getBalance()- amt;
		
		if(total<2000)
		{
			try {
			throw new InsufficientFund();
			}
			catch (InsufficientFund e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
