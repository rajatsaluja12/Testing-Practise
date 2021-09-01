package fareye;

import java.util.PriorityQueue;

public class Chalo {

	public static void main(String[] args) {
		
		
		PriorityQueue todo = new PriorityQueue();
		todo.add("dishes");
		todo.add("laundry");
		todo.add("bills");
		todo.offer("bills");
		System.out.println(todo.size()+""+todo.poll());
		System.out.println(""+todo.peek()+""+todo.poll());
		System.out.println(""+todo.poll()+""+todo.poll());
		
		
	}

}
