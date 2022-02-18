package javatutorial;

import java.util.Scanner;

public class Iff {
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		//if (num%2==0) {
		//	System.out.println("Even");
		//}
	//	else {
			
	//		System.out.println("odd");
	//	}
	
		
		
		switch (num) {
		case 1:
			
			System.out.print("Janury");
			break;
		case 2:
			System.out.print("Febuary");
			break;
		case 3:
			System.out.print("March");
			break;
		case 4:
			System.out.print("April");
			break;
		case 5:
			System.out.print("May");
			break;
			
		case 6:
			System.out.print("June");
			break;
		case 7:
			System.out.print("July");
			break;
		case 8:
			System.out.print("August");
			break;
		case 9:
			System.out.print("September");
			break;
		case 10:
			System.out.print("october");
			break;
		case 11:
			System.out.print("November");
			break;
		case 12:
			System.out.print("December");
			break;
		default:
			System.out.print("Enter number is not month number");
			
		}
	}
	}


