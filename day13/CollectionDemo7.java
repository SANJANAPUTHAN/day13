package day13;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionDemo7 {
public static void main(String[] args) {
//	Queue<Integer> queue=new PriorityQueue<>();
//	
//	queue.add(20);
//	queue.add(30);
//	queue.add(40);
//	
//	System.out.println(queue.poll());
//	System.out.println("----------------------------");
//	
//	queue.add(15);
//	queue.add(35);
//	System.out.println(queue.element());
//	System.out.println("----------------------------");
//	
//	System.out.println(queue.remove());
//	System.out.println("----------------------------");
//	
//	Iterator<Integer> iter=queue.iterator();
//	while(iter.hasNext())
//	{
//		System.out.println(iter.next());
//	}
	
	Queue<Employees> queue=new PriorityQueue<>();
	queue.add(new Employees("sanjana"));
	queue.add(new Employees("anupriya"));
	queue.add(new Employees("shilpha"));
	
	Iterator<Employees> iter=queue.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next().toString());
	}	
}
}
class Employees implements Comparable<Employees>
{
	String name;
	public Employees(String name)
	{
		this.name=name;
	}
	@Override
	public int compareTo(Employees o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}