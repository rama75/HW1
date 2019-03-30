package JavaHW1;

import java.util.Scanner;

public class Arithmetic_scanner 

{
	
	public static  void main(String args[])
	{
		int x,y,z;
		
		
		System.out.println("enter the two numbers");
		
		Scanner S = new Scanner(System.in);
		
		
		x = S.nextInt();
		y = S.nextInt();
		
		S.close();
		
		
		z = x+y;
		System.out.println("Sum is:" +z);
		
		z = x*y;
		System.out.println("Product is:" +z);
		
		z = x-y;
		System.out.println("Differene is:" +z);
	}
	
}
