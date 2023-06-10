package in.rays.basics;

//Print the sum of all integers present in a string
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"dnk@641vfu", "dfoiw498345jnnsdbf","dbvs@$59bc*hgf"};
		//int count=0;
		int sum=0;
		
		for(int i =0; i<s.length;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				char c = s[i].charAt(j);
				if(c>='0' && c<='9')
				{
					//count++;
					//System.out.println(s[i].charAt(j));
					//Type cast char to integer
					int num=Integer.parseInt(String.valueOf(s[i].charAt(j)));  
				    System.out.print(num);
				    System.out.println("\t");
				    
				    sum = sum+num;
				    num=0;
				}
			}
		}
		System.out.println("");
		System.out.println("Sum is = "+sum);
		
	}		
}
