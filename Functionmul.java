package javatutorial;

import java.util.Scanner;

public class Functionmul {
	public static int mul (int a,int b)
	{
		int multi=a*b;
		return multi;
		
	}

	
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int multi=mul(a,b);
		System.out.println("it is multiplcation of 2 numbers  "+multi);
	
	
	}
	
}
