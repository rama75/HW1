package JavaHW1;

import java.util.Scanner;

public class sumOfn 

{

	public static void main(String[] args) 
	
	{
		int n; 
		int c = 0; 
		int sum = 0;
		
		System.out.println("enter the value of n");

		Scanner sc = new Scanner (System.in);
		
		n=sc.nextInt();

		sc.close();
		
		while (c<=n)
		{
			sum = sum+c;
			c++;
			
		}
		System.out.println("Sum of first "+n+" natural numbers is: "+sum);
		
		
	
	}
		
		
}
	
