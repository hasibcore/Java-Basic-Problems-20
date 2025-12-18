/* Write a program that performs the following tasks:
- Prompt the user to input a decimal number n.
- Convert the number n into its binary equivalent.
*/
import java.util.Scanner;
public class Decimal_Binary
{
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int arr[]=new int[100];
		int i=0;
		System.out.print("Conversion Binary : ");
		if(num==0)
		{
		    
		   System.out.print("0");
		}
		else
		{
		   while(num!=0)
	     	{
			int reminder=num%2;
			num=num/2;
			arr[i]=reminder;
			i++;
	     	}
		}
		while(i>0)
		{
		   
			System.out.print(arr[i-1]);
			i--;
		}
	}
}