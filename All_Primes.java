//Print All Primes in a Range
import java.util.Scanner;
public class All_Primes
{
	public static void main()
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the range no. : ");
		int num=sc.nextInt(),c=1;
		for(int i=1;i<=num;i++)
		{
			c=1;
			if(i<=1)
			{
				c=0;
			}
			else
			{
			  for(int j=2;j<=i/2;j++)
			  {
				 if(i%j==0)
				 {
					c=0;
					break;
				 }
				
			   }
			 }
		 
			if(c==1)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}