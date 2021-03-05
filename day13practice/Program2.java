package day13practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
public static void main(String[] args) {
	List<String> list=createList();
	list.removeIf(s->s.toLowerCase().contains("and"));
	list.forEach(s->{System.out.println(s);});
}
static List<String> createList()
{
	List<String> list=new ArrayList<>();
	list.addAll(Arrays.asList("Sanjana","shilpha","anu and"));
	return list;
}
}
