package day13;

import java.util.ArrayList;

public class GenericsDemo2 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList();
	list.add("sanjana");
	list.add("anu");
	list.add("nithu");
	
	for(int i=0;i<list.size();i++)
	{
		String str=(String) list.get(i);
		System.out.println(str);
	}
}
}
