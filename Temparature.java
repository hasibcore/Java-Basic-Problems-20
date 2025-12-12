//1.Write a program to convert Celsius temperature to Fahrenheit..
import java.util.Scanner;
public class Temparature {
	
	 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter celius temparature: ");
	 double cel=sc.nextDouble();
	 double fahr=((9*cel)/5)+32;
	 System.out.println("Tamparature in Fahrenheit :"+fahr);
	}
}

