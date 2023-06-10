package in.rays.collection;

import java.util.*;

public interface Collect {
	public static void main(String[] args) {
		Collection list1 = new ArrayList();
		
		list1.add(1);
		list1.add("abc");
		
		System.out.println("First LIst is = "+list1);
		
		Collection list2 = new ArrayList();
		
		list2.add(2);
		list2.add("def");
		System.out.println("Second LIst is = "+list2);
		
		//Add two collections
		list1.addAll(list2);
		System.out.println(list1);
		
		//clear elements
		Collection list3 = new ArrayList();
		list3.add("lkj");
		list3.add(7);
		System.out.println(list3);
		list3.clear();
		System.out.println("Empty collection= "+list3);
		
		//Print size of the collection
		System.out.println("Size of List1 = "+list1.size());
		System.out.println("Size of List2 = "+list2.size());
		
		//Remove an element
		list1.remove(1);
		System.out.println("After removing "+list1);
		
		//Remove a collection
		list1.removeAll(list2);
		System.out.println("After removing list2 "+ list2);
		
		//contains
		System.out.println(list1.contains("abc"));
	}

}
