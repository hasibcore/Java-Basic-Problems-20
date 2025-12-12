//4.Write a program to check whether a year is a leap year.
import java.util.Scanner;
public class leap_year{
	public static void main(String[]args){
		Scanner lengra=new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year=lengra.nextInt();
		if(year%400==0)
		{
			System.out.println(year+" is a leap year");
		}
		else{
			if(year%100!=0 && year%4==0){
			System.out.println(year+" is a leap year");	
			}
			else{
				System.out.println(year+" is not a leap year");
			}				
		}
	}
}