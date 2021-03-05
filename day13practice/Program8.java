package day13practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program8 {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("sanjana");
	list.add("shilpha");
	list.add("anu");
	
	ListIterator<String> iterator=list.listIterator();
	
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	while(iterator.hasPrevious())
	{
		System.out.println(iterator.previous());
	}
}
}
