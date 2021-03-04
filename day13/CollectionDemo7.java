package day13;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionDemo7 {
public static void main(String[] args) {
	Queue<Integer> queue=new PriorityQueue<>();
	
	queue.add(20);
	queue.add(30);
	queue.add(40);
	
	System.out.println(queue.poll());
	System.out.println("----------------------------");
	
	queue.add(15);
	queue.add(35);
	System.out.println(queue.element());
	System.out.println("----------------------------");
	
	System.out.println(queue.remove());
	System.out.println("----------------------------");
	
	Iterator<Integer> iter=queue.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
}
}
