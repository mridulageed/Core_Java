package in.rays.comparator_int;
import java.util.*;

public class Employee implements Comparator<Employee>{
	public int id;
	public String name;
	public String address;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, String address) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+address;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.id - o2.id;
	}

}
