package javatutorial;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class Strings {

	public static void main(String[] args) {
		//System.out.println("hello rv is here");
		String name1=("hello type string here");
	System.out.println(name1);
		

		Scanner sc= new Scanner (System.in);
		String name=sc.nextLine();
			System.out.println("You have this   "+name);
			

			  //concatenation
			String Firstname=("Rushikesh");
			String Lastname=("Vayandeshkar");
			String Fullname=(Firstname+""+Lastname);
			System.out.println(Fullname);
			System.out.print(Fullname.length());
					
			System.out.println(name.length());
		//for(int i=0;i<Fullname.length();i++)
		//{
			//System.out.println(Fullname.charAt(i));
			if(Firstname.compareTo(Lastname)==0)
			{
				System.out.println("strings are equal ");
			}
			else {
				
				
				System.out.println("strings are not equal");
				
			}
			
		
	}

}
