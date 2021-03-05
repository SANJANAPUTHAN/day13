package day13practice;

import java.util.HashSet;
import java.util.Set;

public class Program9 {
private int id;
private String value;
public Program9(int id,String value) {
	this.id=id;
	this.value=value;
}
public final String getValue() {
	return value;
}
public int getId()
{
	return id;
}
@Override
	public int hashCode() {
	int prime=31;
	int result=1;
	result=result*prime+id;
	result=prime*result+((value==null)?0:value.hashCode());
	return result;
	}
public static void main(String[] args) {
	Set<Program9> set=new HashSet<>();
	Program9 test1=new Program9(1, "one");
	Program9 test2=new Program9(1, "one");
	set.add(test1);
	set.add(test2);
	System.out.println(set.size());
}

}
