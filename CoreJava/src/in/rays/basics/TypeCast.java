package in.rays.basics;

public class TypeCast {

	public static void main(String[] args) {
		//Type-casting Primitive to Primitive
		long l = 10;
		int i= (int)l;
		System.out.println(l);
		
		//Type-casting Primitive to Non-Primitive
		String s = "20";
		Integer.parseInt(s);
		System.out.println(s);
		
		//Type-casting Non-Primitive to Primitive
		int j = 100;
		String.valueOf(j);
		System.out.println(j);
		
		//Type-casting SteingBuffer to String
		
		//String s1 = "Hello World";
		StringBuffer sb = new StringBuffer("Hell0");
		sb.append(" World");
		//System.out.println(sb);
		System.out.println(sb.toString().toLowerCase());
	}
}
