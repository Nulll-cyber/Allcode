package javatutorial;

import java.util.ArrayDeque;

public class ArrrayDeque_ {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq =new ArrayDeque<> ();
		{
			adq.offer(29);
			adq.offer(49);
			adq.offer(59);
			adq.offer(69);
		
			adq.offerFirst(79);
			System.out.println(adq);
			adq.poll();
			System.out.println(adq);
		}
	}

}
