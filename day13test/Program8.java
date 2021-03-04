package day13test;

import java.util.ArrayList;
import java.util.List;

public class Program8 {
	public static <E extends Number> List<E> process(List<E> nums) 
	{
		return nums;		
	}
	 
	 public static void main(String[] args) {
		 
		 List<Integer> input = null; List<Integer> output ; 
		 output = process(input); 
		 System.out.println(output);
	 }
	
}
/*--------
option b,e,f because in those options the input passed is either list or an arraylist with the specific number or integer
which matches the function declaration and the op is observed*/