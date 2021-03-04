package day13;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class CollectionDemo4 {
public static void main(String[] args) {
	Map<MyKey,String> map=new WeakHashMap<>();
	MyKey mykey1=new MyKey("1");
	MyKey mykey2=new MyKey("2");
	MyKey mykey3=new MyKey("3");
	
	map.put(mykey1, "sanjana");
	map.put(mykey2, "shilpha");
	map.put(mykey3, "anu");
	
	mykey1=null;
	System.out.println(map);
	System.gc();
	System.out.println(map);
}
}
