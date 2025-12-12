//2. Write a program to calculate simple interest.
import java.util.Scanner;
public class simple{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principal : ");
		double pr=scan.nextDouble();
		System.out.println("Enter the rate of interest : ");
		double rate=scan.nextDouble();
		System.out.println("Enter the time : ");
		int time=scan.nextInt();
		double interest=(pr*rate*time)/100;
		System.out.println("The total simple interest : "+interest);
	}
}