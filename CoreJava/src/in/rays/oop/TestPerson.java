package in.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		
		String s = "11/05/2000";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		
		p.setName("Mridula Geed");
		System.out.println(p.getName());
		
		p.setAddress("Indrapuri Colony");
		System.out.println(p.getAddress());
		
		p.setDate(d);
		System.out.println(p.getDate());
		
		System.out.println(p.getAge(20));

	}

}
