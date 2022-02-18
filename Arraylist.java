package javatutorial;
import java.util.ArrayList;
import java.util.Collections;





public class Arraylist {
	public static void main(String[]args) {
		
	
	
	ArrayList<Integer> list=new ArrayList <Integer>();
	
	{
		list.add(35);
		list.add(53);
		list.add(33);
		list.add(83);
		list.add(3,3);
		list.set(0,53);
		list.remove(0);
		int size=list.size();
		int a=list.get(0);
	//	System.out.println(a); 
		System.out.println(list);
		System.out.println(size);
		Collections.sort(list);
		System.out.println(list);
		
	}
	
}

}