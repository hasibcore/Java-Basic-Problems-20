// Prime Number Checker
import java.util.Scanner;
public class Prime_number_check{
	public static void main(String[]args){
		Scanner ayee=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=ayee.nextInt();
		boolean isprime;
		isprime=true;
		if(num<=1)
		{
		isprime=false;
		}
		else
		 {
		    for(int i=2;i<=num/2;i++)
		    {
			   if(num%i==0)
			  {
				isprime=false;
				break;
			  }
		 }
			
		}
		System.out.println("Is prime : "+isprime);
		ayee.close();	
		
	}
}