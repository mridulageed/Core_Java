package in.rays.basics;

public class FindNumber {

	public static void main(String[] args) {
		int[] num= {112,23,34,45,56,67,78,89,90,100};
		int n = 33;
		int index = -1;
		
		for(int i =0; i< num.length; i++)
		{
			if(num[i]==n)
			{
				index=i;
				
			}
				
		}
            System.out.println(index);
	}

}
