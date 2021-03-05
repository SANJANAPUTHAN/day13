package day13practice;

import java.util.ArrayList;
import java.util.List;

public class Program6 {
public static void main(String[] args) {
	int[] input= {1,-2,0,-1,5,-4};
	int target=2;
	System.out.println(threesum(input,target));
}

public  static List<List<Integer>> threesum(int[] input, int target) {
	List<List<Integer>> list=new ArrayList<List<Integer>>();
	
	for(int i=0;i<input.length;i++)
	{
		for(int j=i;j<input.length;j++)
		{
			for(int k=0;k<input.length;k++)
			{
				if(i!=j && j!=k && k!=i && (input[i]+input[j]+input[k]==target))
				{
					List<Integer> list1=new ArrayList<Integer>(3);
					list1.add(i);
					list1.add(j);
					list1.add(k);
					list.add(list1);
				}
			}
		}
	}
	return list;
}
}
