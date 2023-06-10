package in.rays.basics;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = {2,4,6,8,9,10};
		int[] b = {2,4,6,8,10,0};
		int sum =0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]-b[i];
		}
		System.out.println("Missing number is = " +sum);
	}

}
