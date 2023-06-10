package in.rays.oop;

public class Account {
	private String number = null;
	private String accountType = null;
	private double balance = 0;
	
	public void setNumber(String number)
	{
		this.number = number;		
	}
	
	public String getNumber()
	{
		return number;
	}
	
	// Getter Setter methods for Account Type
	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}
	
	public String getAccounttype()
	{
		return accountType;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;		
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		double total = getBalance()+amount;
		
		if(total<2000)
		{
			System.err.println("Insuffient Balance");
		}
		else
			System.out.println("Balance is = "+total);
		
	}
	
	public void withdrawal(double amount)
	{
		double total = getBalance()- amount;
		System.out.println("Balance is ="+total);
	}

}
