package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemo3 {
public static void main(String[] args) {
	Map<MyKey,String> map=new HashMap<>();
	MyKey mykey1=new MyKey("1");
	MyKey mykey2=new MyKey("2");
	MyKey mykey3=new MyKey("3");
	
	map.put(mykey1, "sanjana");
	map.put(mykey2, "shilpha");
	map.put(mykey3, "anu");
	
	Set<Map.Entry<MyKey, String>> set=map.entrySet();
	Iterator<Map.Entry<MyKey,String>> iter=set.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	
	Map<MyKey,String> map1=new TreeMap<>((o1,o2)->{return o1.compareTo(o2);});
	
	MyKey key1=new MyKey("1");
	MyKey key2=new MyKey("2");
	MyKey key3=new MyKey("3");
	
	map1.put(key1, "sanjana");
	map1.put(key2, "shilpha");
	map1.put(key3, "anu");
	
	Set<Map.Entry<MyKey, String>> set1=map1.entrySet();
	Iterator<Map.Entry<MyKey, String>> iter1=set1.iterator();
	while(iter1.hasNext())
	{
		System.out.println(iter1.next());
	}
}
}
class MyKey implements Comparable<MyKey>
{
	String key;
	public MyKey(String key)
	{
		this.key=key;
	}
	@Override
	public String toString() {
		return this.key;
	}
	@Override
	public int compareTo(MyKey o) {
		return this.key.compareTo(o.key);
	}
	
}