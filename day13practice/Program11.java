package day13practice;

import java.util.Enumeration;
import java.util.Hashtable;


public class Program11 {
public static void main(String[] args) {
	Hashtable<String, Double> map=new Hashtable<String, Double>();
	Enumeration<String> names;
	
	String name;
	map.put("sanjana", (double) 1000);
	map.put("sindu",(double) 2000);
	map.put("saju", 345.90);
	
	names=map.keys();
	while(names.hasMoreElements())
	{
		name=names.nextElement();
		System.out.println(name+" "+map.get(name));
	}
	
	double bal=map.get("sanjana");
	map.put("sanjana", bal+10000);
	System.out.println(map.get("sanjana"));
	
}
}
