package in.rays.comparable_int;
import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Employee(2,"abc", "indore"));
		list.add(new Employee(5,"rahul", "dewas"));
		list.add(new Employee(1,"ram", "ujjain"));
		
		Collections.sort(list);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		

	}

}
