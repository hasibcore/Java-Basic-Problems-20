// Checking palindrome of a number
import java.util.Scanner;
public class Palindrome{
 public static void main(String[]args){
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the number : ");
   int num=scan.nextInt();
   int num2,reverse=0,z;
   num2=num;
   while(num!=0){
      z=num%10;
      reverse=reverse*10+z;
      num=num/10;
    }
   if(num2==reverse)
    {
      System.out.println(num2+" is a palindrome.");
     }
   else
    {
      System.out.println(num2+" is not palindrome.");
    }
  }
  
}