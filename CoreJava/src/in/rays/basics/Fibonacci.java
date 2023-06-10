package in.rays.basics;

public class Fibonacci {

	public static void main(String[] args) {
		int num=3; int n1=0,n2=0,n3=0;
		for(int i=0; i<=num; i++)
		{
		    for(int j=0; j<=3;j++)
			n3= n1+n2;
		     n1=0;
		     n1=n2;
		}
		System.out.print(+n1);
		System.out.println(+n2);
}
}
