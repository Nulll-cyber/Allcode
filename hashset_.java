package javatutorial;

import java.util.HashSet;
import java.util.Set;

public class hashset_ {
	public static void main (String[]args) 
	{
 Set<Integer>set=new HashSet<>();
  set.add(23);
		
  set.add(23);
  set.add(43);
  set.add(237);
  System.out.println(set);
  set.remove(23);
  System.out.println(set);
  System.out.println(set.contains(237));//it is use to search element in hashset
  
	}

}
