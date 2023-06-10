package in.rays.collection;
import java.util.*;

public interface Listt {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		
		//Insert element
		list1.add(1);
		System.out.println(list1);
		
		//Insert element at particular index
		list1.add(1, "abc");
		   //System.out.println("List 1 = "+list1);
		list1.add(2, "3");
		   //System.out.println("List 1 = "+list1);
		list1.add(3, "def");
		System.out.println("List 1 = "+list1);
		
		//To show 'i'th value
		
		System.out.println("Value at index is 1 = "+list1.get(1));
		
		
		//Remove 'i'th element
		list1.remove(1);
		System.out.println("List after removing value from 1st index= "+list1);
		
		//Replace value
		list1.set(2, "ghi");
		System.out.println("List after replace = "+list1);
		
		//Searches object
		System.out.println("Index of element 1 is = "+list1.indexOf(1));
		
		//Search last index
		System.out.println("Last index is = "+ list1.lastIndexOf("ghi"));
		
		//Add two list
		
		//Sublist
		System.out.println("Sublist of list1 is = "+list1.subList(0, 2));
	}

}
