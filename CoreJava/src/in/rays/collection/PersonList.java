package in.rays.collection;
import java.util.*;

public class PersonList {
public static void main(String[] args) {
	Person p1 =new Person(1,"abc","indore");
	Person p2 =new Person(2,"def","indore");
	Person p3 =new Person(3,"ghi","indore");
	Person p4 =new Person(4,"jkl","indore");
	
	List list = new ArrayList();
	
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	
	//list.add(1);
	//list.add("abc");
	Iterator it = list.iterator();
	while(it.hasNext())
	{
		//Person p = (Person) it.next();
		System.out.println(it.next());
	    	
	
	}
}
}
