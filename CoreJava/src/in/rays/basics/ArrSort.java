package in.rays.basics;

public class ArrSort {

	public static void main(String[] args) {
		int[] arr= {11,2,34,6,78,9,100};
		
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0+i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.print(arr[i]);
			System.out.print(" ");
			
			
		}
		
			

	}

}
