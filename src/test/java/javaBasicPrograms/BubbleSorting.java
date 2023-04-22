package javaBasicPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BubbleSorting {
	@Test
	void bubbleSort()
	{
		int a[]= {8,1,5,10,4,2,6},temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
