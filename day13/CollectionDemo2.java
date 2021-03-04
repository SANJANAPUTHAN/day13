package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo2 {
public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	set.add("sanjana");
	set.add("shilpha");
	set.add("anu");
	
	Iterator<String> iter=set.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	
	Set<String> set1=new TreeSet<String>((o1,o2)->{return o1.compareTo(o2);});
	set1.add("sanjana");
	set1.add("shilpha");
	set1.add("anu");
	
	Iterator<String> iter1=set1.iterator();
	while(iter1.hasNext())
	{
		System.out.println(iter1.next());
	}
}
}
