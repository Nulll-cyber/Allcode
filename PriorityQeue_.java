package javatutorial;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQeue_ {
public static void main(String args[])
	{
	
	Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
	 	pq.offer(233);
	 	pq.offer(255);
	 	pq.offer(234);
	 	pq.offer(235);
	 	
	 	pq.offer(237);
	pq.poll();//it delete first element 
	 
	
	System.out.println(pq);
	System.out.println(pq.peek());
	
	
			}
}

