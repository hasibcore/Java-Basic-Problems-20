//5.Factorial of a Number
import java.util.Scanner;
 public class factorial{
  public static void main(String[]args){
   Scanner niggarif=new Scanner(System.in);  
   int num;
   System.out.println("Enter the number : ");
    num=niggarif.nextInt();
	int mul=1;
	int num2=num;
	while(num!=0){
	  mul=mul*num;
		num--;
	}
	  System.out.println("Factorial of "+num2+" is "+mul);
   }
 }