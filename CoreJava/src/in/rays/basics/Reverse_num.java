package in.rays.basics;

public class Reverse_num {
public static void main(String[] args) {
		int number= 121;
	
		int r; int sum =0;
		while(number>0)
		{
			r= number%10;
			sum = (sum*10)+r;
			number = number/10;
		}
		
		System.out.println(sum);
		
	}
}
