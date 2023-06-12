package in.rays.FailFast;
import java.util.*;

public class FailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec = new Vector();
		
		vec.add(1);
		vec.add("abc");
		vec.add(2);
		vec.add("def");
		
		Enumeration e = vec.elements();
		
		vec.add(3);
		while (e.hasMoreElements()) {
			System.out.print("\t"+e.nextElement());
			
		}
		

	}

}
