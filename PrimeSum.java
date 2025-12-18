import java.util.Scanner;
public class PrimeSum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int count=0,num=2,sum=0;
		while(count<n)
		{
			boolean prime=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					prime=false;
					break;
				}
				
			}
			if(prime==true)
			{
				sum=sum+num;
				count++;
			}
			
			num++;
		}
		
			System.out.println("Result of the series : " +sum);
		
	}
}