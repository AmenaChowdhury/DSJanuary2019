package ds;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList();
		queue.add("NY");
		queue.add("PA");
		queue.add("NJ");
		queue.add("FL");
		
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
	}

}
