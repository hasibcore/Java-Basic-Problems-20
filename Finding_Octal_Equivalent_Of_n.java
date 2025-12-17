/*Write a JAVA code that will -
1. Prompt the user to input a number “n”.
2. Find the octal equivalent of “n”.
3. Count the number of even digits in its octal equivalent.
4. Show the octal equivalent and even count like the sample output*/

import java.util.Scanner;
public class Finding_Octal_Equivalent_Of_n{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int decimal=sc.nextInt();
	int sum1=0,sum2=0,z,i=0;
	int count=0;
	int arr[]=new int[100];
	System.out.println("Octal Value : ");
	if(decimal==0)
	{
	System.out.print("0");
	}
	else{
	while(decimal!=0){
		z=decimal%8;
		
		arr[i]=z;
		decimal=decimal/8;
		
		i++;
		}
	 

       for(int m=i-1;0<=m;m--)
          {
			
			 System.out.print(arr[m]);
			    if(arr[m]%2==0){
			        if(arr[m]!=0){
			       count++;
			        }
			    }  
          }
			   }
			    System.out.println("\nNumber of even digits: "+count);
			 }
		
           }
           
	
	
  
