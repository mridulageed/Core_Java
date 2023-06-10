package in.rays.basics;

public class ReverseDigits {

	public static void main(String[] args) {
		int num = 123;
		int r;
		int sum=0;
		while(num>0) {
		r = num%10;
		//System.out.println(r);
		num=num/10;
		//System.out.println(num);
		sum = (sum*10)+r;

	}
        System.out.println(sum);
}
}