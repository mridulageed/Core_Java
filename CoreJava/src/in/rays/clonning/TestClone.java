package in.rays.clonning;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Account a1 = new Account(100);
		//Account a2 = (Account)a1.clone();
		//a2.setBalance(20);

		//System.out.println(a1.getBalance());
		//System.out.println(a2.getBalance());
		
		Customer c1 = new Customer("Mridula");
		
		Customer c2 = (Customer)c1.clone();
		c2.setName("Ajbsjcb");
		c2.acc.setBalance(20);
		
		
		
		System.out.println("Original Object");
		System.out.println(c1.getName());
		System.out.println(c1.acc.getBalance());
		
		System.out.println("");
		System.out.println("Clonned Object");
		System.out.println(c2.getName());
		System.out.println(c2.acc.getBalance());
		
		

	}

}
