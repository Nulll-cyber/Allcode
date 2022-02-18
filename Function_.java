package javatutorial;

import java.util.Scanner;

public class Function_ 
{
public static void myName(String name1)
{
	System.out.println(name1);
	return;
}
public static int cal(int a,int b)
{
	int sum=a+b;
	return sum;
	
}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//String name1=sc.next();
		//myName(name1);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int sum=cal(a,b);	
		 System.out.print(sum);
	}
		// TODO Auto-generated method stub

	}


