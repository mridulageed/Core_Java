package in.rays.basics;
import java.util.*;
import java.text.*;

public class Daate {
	public static void main(String[] args) throws ParseException {
    // Changed Date format and Type-cast Date to String
	Date today = new Date();
	System.out.println(today);
	SimpleDateFormat sdm = new SimpleDateFormat("dd/MM/yyyy");
	String s = sdm.format(today);
	System.out.println(s); 
	
	//Type-cast String to Date
	String src = "29/05/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d= sdf.parse(src);
	System.out.println(src);
	

}
}