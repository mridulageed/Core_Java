package in.rays.collection;
import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Rays","Indore");
		Employee e2 = new Employee(1,"Rays","Indore");
		
		//Person p1 = new Person(1,"Rays","Indore");
		
		List list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());

	}

}
