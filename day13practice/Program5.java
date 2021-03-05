package day13practice;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("sanjana");
	list.add("shilpha");
	System.out.println(list.contains("sanjana"));
	System.out.println(list.indexOf("shilpha"));
	list.clear();
	System.out.println(list);
	System.out.println(list.get(1));
}
}
