package in.rays.basics;

public class DivisibleBy7 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		 for (int i = 101; i < 200; i++)
		 {
		     if (i % 7 == 0)
		     {
		         sum = sum + i;
		         count++;
		     }
		 }
		 System.out.println("The Sum of the numb "+sum);
		 System.out.println("Total numbers  "+count);
		 int avg = (sum)/count;
		 System.out.println("Average is = "+avg);
}
}