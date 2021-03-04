package day13;

public class GenericsDemo1 {
public static void main(String[] args) {
	PaintBrush<Water> brush = new PaintBrush();
	brush.obj=new Water();
	Water water=brush.getObj();
	System.out.println(water);
	
	
	PaintBrush<Paint> brush2=new PaintBrush();
	brush2.obj=new RedPaint();
	RedPaint paint=(RedPaint) brush2.getObj();
	System.out.println(paint);
	
}
}
abstract class Paint
{
	
}
class RedPaint extends Paint
{
	
}
class BluePaint extends Paint
{
	
}
class Water
{
	
}
class PaintBrush<T>
{
	T obj;
	public void setObj(T obj)
	{
		this.obj=obj;
	}
	public T getObj()
	{
		return obj;
	}
}