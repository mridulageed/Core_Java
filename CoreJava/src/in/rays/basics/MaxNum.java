package in.rays.basics;

public class MaxNum {

	public static void main(String[] args) {
		int[] num= {34,45};
		int a=0; int b = num[0];
		
		for(int i=0;i<num.length; i++)
		{
			if(num[i]>b)
			{
				a=b; b= num[i];
			}
			
		}System.out.println(b); 

	}

}
