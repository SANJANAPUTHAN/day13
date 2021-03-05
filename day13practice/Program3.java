package day13practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Program3 {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	map.put(11, "sanjana");
	map.put(22, "shilpha");
	map.put(33, "anu");
	
	Iterator iterator=map.entrySet().iterator();
	while(iterator.hasNext())
	{
		Map.Entry<Integer, String> me=(Entry<Integer, String>) iterator.next();
		System.out.println(me.getKey()+" "+me.getValue());
	}
}
}
