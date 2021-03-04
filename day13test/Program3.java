package day13test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Program3  {
	public static void before() { 
		Set set = new TreeSet(); 
		set.add("2"); 
		set.add(3); 
		set.add("1"); 
		Iterator it = set.iterator(); 
		while (it.hasNext()) {
		System.out.print(it.next() + " "); 
		} 
}
	public static void main(String[] args) {
		Program3.before();
	}
	}
/*
--------------the program will throw an error because it shows classcastexception of not converting integer to string
in the set------------*/