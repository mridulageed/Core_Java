package in.rays.constructor;

public class Employee extends Person2{
	private String department;
	
	public Employee(int id, String name, String address,String department)
	{
		super(id,name,address);
		System.out.println("ncksj");
		this.department=department;
	}
	
	public void getDepartment()
	{
		System.out.println(department);
	}
	
}	