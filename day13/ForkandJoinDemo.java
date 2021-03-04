package day13;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkandJoinDemo {
public static void main(String[] args) {
	int arr[]= {1,2,1,3,4,2,4,5,1,2};
	
	
	
	ForkJoinPool fjPool=ForkJoinPool.commonPool();
	OurTask task1=new OurTask(0, 3, arr, 1);
	OurTask task2=new OurTask(3, 6, arr, 1);
	OurTask task3=new OurTask(6, 8, arr, 1);
	OurTask task4=new OurTask(8, 10, arr, 1);
	
	int result1=fjPool.invoke(task1);
	int result2=fjPool.invoke(task2);
	int result3=fjPool.invoke(task3);
	int result4=fjPool.invoke(task4);
	
	System.out.println(result1+result2+result3+result4);
	
}
}
class OurTask extends RecursiveTask<Integer>
{
	int start;
	int end;
	int arr[];
	int key;
	public OurTask(int start,int end,int arr[],int key) {
		this.start=start;
		this.end=end;
		this.arr=arr;
		this.key=key;
	}
	

	@Override
	protected Integer compute() {
		int count=0;
		for(int i=start;i<end;i++)
		{
			if(arr[i]==key)
			{
				count++;
			}
		}
		return count;
	}
	
}