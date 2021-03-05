package day13practice;

import java.util.HashMap;
import java.util.Map;

public class Program12 {
	public static void main(String[] args) {
		
	Map<String,Integer> map=createMap();
	map.keySet().forEach(key->System.out.println(key+" "+map.get(key)));
	}

private static Map<String,Integer> createMap()
{
	Map<String,Integer> map=new HashMap<>();
	map.put("sanjana", 0);
	map.put("shilpha", 0);
	map.put("anu", 0);
	return map;
}
}