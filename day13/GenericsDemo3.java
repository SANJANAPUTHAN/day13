package day13;

public class GenericsDemo3 {
	public <E>E[] getObj(E[] elements)
	{
		return elements;
	}
	public <E> void getObject(E[] elements)
	{
		for(E e: elements)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	GenericsDemo3 gd=new GenericsDemo3();
	System.out.println(gd.getObj(new String[]{"sanjana"}));
	String[] e=gd.getObj(new String[] {"Sanjana","anu"});
	gd.getObject(new Integer[] {1,2,3,4});
}
}
