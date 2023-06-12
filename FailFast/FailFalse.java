package in.rays.FailFast;

import java.util.*;


public class FailFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		list.add(1);
		list.add("abc");
		list.add(2);
		list.add("def");
		
		Iterator it = list.iterator();
		
		list.add(3);
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
