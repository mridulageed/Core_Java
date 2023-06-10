package in.rays.basics;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {1,2,890,1000,7};
		int a=0; int b = arr[0];
		
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]>b)
			{
				a=b; b= arr[i];
			}
		}
          System.out.println(a);
	}

}
