package JavaHW1;

import java.util.Scanner;

public class Swap 
{

	public static void main(String args[])
	{
		
		int a, b, x;
		System.out.println("Enter the numbers");
		
		Scanner s = new Scanner (System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		s.close();
		
		System.out.println("The numbers before swapping:" +a+","+b);
		x = a;
		a = b;
		b = x;
		
		System.out.println("The numbers before swapping:" +a+","+b);
		
		
		
		 
		
	}
	
	
	
}
