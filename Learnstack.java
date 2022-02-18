package javatutorial;

import java.util.Stack;

public class Learnstack {

	public static void main(String[] args) {
		Stack <String> animal= new Stack <>();
		animal.push("Tiger");
		animal.push("lion");
		animal.push("chetan");
		animal.push("horse");
		animal.push("dog");
		animal.push("cat");
		animal.pop();//it delete cat from stack
	
		System.out.println(animal);
	}

}
