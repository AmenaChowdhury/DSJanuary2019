package ds;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		stack.add("NY");
		stack.add("PA");
		stack.add("FL");
		stack.add("CA");
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.push("AZ"));
		System.out.println(stack.peek());

	}

}
