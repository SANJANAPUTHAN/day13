package day13practice;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
public static void main(String[] args) {
	MyKeys m1=new MyKeys(1);
	MyKeys m2=new MyKeys(2);
	MyKeys m3=new MyKeys(1);
	MyKeys m4=new MyKeys(new Integer(1));
	
	Map map=new HashMap();
	map.put(m1, "sanjana");
	map.put(m2,"shilpha");
	map.put(m3, "anu");
	map.put(m4, "sanj");
	
	System.out.println(map.size());
}
}
class MyKeys
{
	Integer key;
	public MyKeys(Integer key) {
		this.key=key;
	}
	public boolean equals(Object o)
	{
		return ((MyKeys) o).key == this.key;
	}
}