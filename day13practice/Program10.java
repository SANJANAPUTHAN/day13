package day13practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program10 {
	public static void main(String[] args) {
		List<String> list=createList();
		list.removeIf(s->s.toLowerCase().contains("x"));
		list.forEach(s->{System.out.println(s);});
	}
	static List<String> createList()
	{
		List<String> list=new ArrayList<>();
		list.addAll(Arrays.asList("Sanjanax","shilpha","anu and"));
		return list;
	}
	}

