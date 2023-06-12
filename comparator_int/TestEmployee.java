package in.rays.comparator_int;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list = new ArrayList();
		
		list.add(new Employee(2,"abc", "indore"));
		list.add(new Employee(5,"rahul", "dewas"));
		list.add(new Employee(1,"ram", "ujjain"));
		
		Collections.sort(list, new Employee());
		
		for (Object object : list) {
			System.out.println(object);
			
		}

	}

}
