package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

class Employee implements Comparable<Employee>
{
	public  String name;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	Employee(String name)
	{
		this.name=name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
public class ArrayListDemo {
public static void main(String[] args) {
List<Employee> list=new ArrayList<>(10);
list.add(new Employee("sanjana"));
list.add(new Employee("shilpha"));
list.add(new Employee("anu"));

ListIterator<Employee> iter=list.listIterator();

while(iter.hasNext()) 
{
	System.out.println("Next....:"+iter.next());
}


while(iter.hasPrevious())
{
	System.out.println("Previous...:"+iter.previous());
}

Collections.sort(list, (o1,o2)->{return o1.compareTo(o2);});
Stream<Employee> s=list.stream();
s.filter((emp) -> emp.name.equals("sanjana")).forEach(System.out::println);
}
}
//class MyComparator implements Comparator<String>
//{
//	
//	@Override
//	public int compare(String o1, String o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//
//
//}