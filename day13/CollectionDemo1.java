package day13;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionDemo1 {
public static void main(String[] args) {
	Vector<String> v=new Vector<>();
	v.add("Sanjana");
	v.add("anu");
	v.add("Shilpha");
	
	Enumeration<String> e=v.elements();
	Iterator<String> iter=v.iterator();
	
	//v.add("sanj");
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	
}
}
