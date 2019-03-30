package JavaHW1;

import java.util.Scanner;

public class Greater_3 
{

	public static void main(String args[])
	{
		
		int a, b, c;
		System.out.println("Enter the numbers");
		
		Scanner s = new Scanner (System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		
		if(a>b && a>c)
			System.out.println(+a+" is the greaest");
		else
			if(b>a && b>c)
				System.out.println(+b+" is the greaest");
			else
				System.out.println(+c+" is the greaest");
		
		
	}
	
}
