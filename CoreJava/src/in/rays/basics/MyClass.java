package in.rays.basics;

public class MyClass {
	public static int sum(int a, int b) {
		int c;
		c= a+b;
		System.out.print("sum="+c);
		return c;
	}
	
	
	public static int[][] tTable(int r, int c)
	{
	    int [][] table = new int[r][c];
	    for (int row = 0; row < table.length ; row++)
	    {
	        for (int column = 0; column < table[row].length; column++)
	        {
	            table[row][column] = (row+1)*(column+1);
	        }

	    }
	    return table;
	}

	
		public void prime(int number) {
			int count = 0;
			int i;
			for(i=2; i<number;i++)
			{
				if(number%i == 0)
				{	
					count++;
				}	
			}
			if(count==0)
			{
				System.out.print("prime");
			}
			else
				System.out.print("not prime");
		}

}

