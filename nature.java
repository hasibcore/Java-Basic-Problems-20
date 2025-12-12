//3. Positive, Negative, or Zero
import java.util.Scanner;
public class nature {
	public static void main(String[]args){
	 Scanner baww=new Scanner(System.in);
	 System.out.println("Enter the number : ");
	 int num=baww.nextInt();
	 if(num>0){
	     System.out.println(num+" is a positive number");
	  }
	  else if(num<0){
		  System.out.println(num+" is a negative number");
	  }
	  else{
		System.out.println(num+" is zero ");
	  }
	}
}