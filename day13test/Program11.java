package day13test;

import java.util.TreeSet;

public class Program11 {
public static void main(String[] args) {
	TreeSet<String> s = new TreeSet<String>(); 
	TreeSet<String> subs = new TreeSet<String>(); 
	s.add("a"); s.add("b"); s.add("c"); s.add("d"); s.add("e"); 
	 subs = (TreeSet)s.subSet("b", true, "d", true); 
	s.add("g"); 
	s.pollFirst(); 
	s.pollFirst(); 
	s.add("c2"); 
	System.out.println(s.size() +" "+ subs.size());
}
}
/* option b and f
5 3 */