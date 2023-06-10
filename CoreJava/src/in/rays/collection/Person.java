package in.rays.collection;

public class Person {
	private int id;
	private String name=null;
	private String address=null;
	
	
	public  Person(int id, String name, String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+address;
	}

}
