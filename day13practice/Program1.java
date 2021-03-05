package day13practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {
	public static class PhoneBookComparator implements Comparator<PhoneBookEntry>
	{
		@Override
		public int compare(PhoneBookEntry p1,PhoneBookEntry p2) {
			return p1.name.compareToIgnoreCase(p2.name);
		}
	}
public static void main(String[] args) {
	PhoneBookEntry p1=new PhoneBookEntry("sanjana");
	PhoneBookEntry p2=new PhoneBookEntry("shilpha");
	PhoneBookEntry p3=new PhoneBookEntry("anu");
	Comparator<PhoneBookEntry> comparator=new PhoneBookComparator();
	TreeSet<PhoneBookEntry> set=new TreeSet<>(comparator);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	
	System.out.println(set);
	Set<PhoneBookEntry> newset=set.descendingSet();
	System.out.println(newset);
}
}
class PhoneBookEntry
{
	public String name,address,phone;
	public PhoneBookEntry(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}