package in.rays.clonning;

public class Customer implements Cloneable{
	private String name=null;
	public Account acc = null;
	
	public Customer()
	{		
	}
	
	public Customer(String name) {
		this.name=name;
		this.acc = new Account(100);
				
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.acc = (Account) acc.clone();
		
		return c;
	}
	
	

}
