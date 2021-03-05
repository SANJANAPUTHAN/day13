package day13practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program13 {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	map=fillmap(map);
	
	String[] strings=keysAsArrays(map);
	for(String string: strings)
	{
		System.out.println(string);
	}
	List<String> list=keysAsList(map);
	for(String string:list)
	{
		System.out.println(string);
	}
}

public static List<String> keysAsList(Map<String, String> map) {
	ArrayList<String> list=new ArrayList(map.keySet());
	return list;
}

public static String[] keysAsArrays(Map<String, String> map) {
	return map.keySet().toArray(new String[map.keySet().size()]);
}

public static Map<String, String> fillmap(Map<String, String> map) {
	map.put("sanjana","iphone");
	map.put("shilpha","oppo");
	map.put("anu","redmi");
	
	return map;
}
}
