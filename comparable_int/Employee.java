package in.rays.comparable_int;
import java.lang.*;

public class Employee implements Comparable<Employee>{
	public int id;
	public String name;
	public String address;
	
	
	public Employee(int id, String name, String address) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+ " "+ name+ " "+ address;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.id==o.id)
		{
			return this.name.compareTo(o.name);
		}
		
		return this.id - o.id;
	}
	
	

}
