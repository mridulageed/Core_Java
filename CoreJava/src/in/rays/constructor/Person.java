package in.rays.constructor;

//Constructor calling in same class 
public class Person {
	private int id;
	private String name;
	private String address;
	
	public Person()
	{
		System.out.println("Zero Pramneter const");
	}
	
	public Person(int id)
	{
		this();
		System.out.println("One parameter const");
	}
	
	public Person(int id, String name)
	{
		this(id);
		System.out.println("Two parameter const");
	}
	public Person(int id, String name, String address)
	{
		this(id,name);
		System.out.println("Three parameter const");
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void getId()
	{
		//this.id=id;
		System.out.println(id);
	}
	public void getName()
	{
		System.out.println(name);
	}
	public void getAddress()
	{
		System.out.println(address);
	}



}
