package in.rays.ExceptionHandle;

public class AccountException extends Exception{
	private String number=null;
	private double balance;
	public AccountException()
	{
		super("Insufficient Balance");
	}
	
	public void setNumber(String number)
	{
		this.number=number;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
		
	}
	public void deposit(double amount)
	{
		double total = getBalance()+amount;
		balance = total;
	}
	
	public void checkBalance() throws AccountException 
	{
		double b = getBalance();
		if(b<2000)
		{
			throw new AccountException();
		}
		else
		{
			System.out.println("Sufficient Balance");
		}
		
	}
	 

}
