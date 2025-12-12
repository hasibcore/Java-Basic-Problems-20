//6.Reverse a Number in inteser
import java.util.Scanner;
public class reverse{
	public static void main(String[]args){
	 Scanner hash=new Scanner(System.in);
	 System.out.println("Enter the number : ");
	 int num=hash.nextInt(),z;
	 int num2=num,marge=0;
	 while(num!=0)
	 {
		z=num%10;
		marge=marge*10+z;
		num=num/10;
	 }
	 System.out.println("Reverse of "+num2+" is "+marge);
	}
}