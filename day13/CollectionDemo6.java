package day13;

import java.util.Iterator;
import java.util.Stack;

public class CollectionDemo6 {
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<>();
	System.out.println(stack.isEmpty());
	stack.push(10);
	stack.push(20);
	stack.push(30);
	
	
	System.out.println(stack.isEmpty());
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	stack.push(40);
	System.out.println(stack.pop());
	
	stack.remove(0);
	System.out.println(stack.elementAt(0));
	
	Iterator<Integer> iter=stack.iterator();
	while(iter.hasNext())
	{
		System.out.println("---------------------------s");
		System.out.println(iter.next());
	}
}
}
