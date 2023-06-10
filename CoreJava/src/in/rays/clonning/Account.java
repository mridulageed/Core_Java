package in.rays.clonning;

public class Account implements Cloneable {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {

		return balance;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
