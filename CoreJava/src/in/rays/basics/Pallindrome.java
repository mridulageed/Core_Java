package in.rays.basics;

public class Pallindrome {
public static void main(String[] args) {
		int num=121;
		int n = 121;
		int r; int sum=0;
		
		while(num>0)
		{
			r= num%10;
			sum = (sum*10)+r;
			num= num/10;
			
			
		}
		//System.out.println("number="+sum);
		if(sum==n)
		{
			System.out.println("Checked");
		}
		else
			System.out.println("NA");
	}
}
