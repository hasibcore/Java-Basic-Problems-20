import java.util.Scanner;
public class Amstrong
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int dig=0,num1=num,sum=0,orginal=num;
		while(num1!=0)
		{
			num1=num1/10;
			dig++;
			
		}
		while(num!=0)
		{
			int z=num%10;
			
			sum=sum+(int)Math.pow(z,dig);
			num=num/10;
		}
		if(sum==orginal)
		{
		System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not Amstrong number");
		}
	}
}