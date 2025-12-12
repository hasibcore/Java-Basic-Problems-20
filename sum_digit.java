//7.Sum of digits
import java.util.Scanner;
 public class sum_digit
 {
  public static void main (String[]args)
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt(),sum=0;
	int num2=num,z;
	while(num!=0)
	{
		 z=num%10;
		sum=sum+z;
		num=num/10;
	}
	System.out.println("Sum of digits of "+num2+" is "+sum);
  } 
 }