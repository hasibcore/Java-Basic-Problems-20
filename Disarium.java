import java.util.Scanner;
public class Disarium
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int num1=num,sum=0,count=0,num2=num;
		while(num2!=0)
		{
			num2=num2/10;
			count++;
		}
		while(num1!=0)
		{
			int z=num1%10;
			sum=sum+(int)Math.pow(z,count);
			num1=num1/10;
			count--;
		}
		if(sum==num)
		{
			System.out.println("Disarium");
		}
		else
		{
			System.out.println("Not Disarium");
		}
	}
}