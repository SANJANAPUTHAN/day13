package day13practice;

import java.util.Arrays;

public class Program15 {
public static void main(String[] args) {
	int arr[]=new int[5];
	for(int i=5;i>0;i--)
	{
		arr[5-i]=i;
	}
	Arrays.fill(arr,1,4,8);
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]);
	}
}
}
