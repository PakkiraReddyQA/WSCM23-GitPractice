package javaStringPrograms;

import org.testng.annotations.Test;

public class ArrayPrograms {
	@Test
	void maxNumber()
	{
		int a[]= {8,20,5,9,2,10,1},
		max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maxi Number:"+max);
	}
	@Test
	void minNumber()
	{
		int a[]= {10,-2,8,0,-12,-1,14,},
		min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
	}
   @Test
   void BubbleSort()
   {
	   int a[]= {4,8,9,1,10,5,12,6};
	   int temp;
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
	   for(int k=0;k<a.length;k++)
	   {
	   System.out.println(a[k]);
	   }
}
   @Test
   void BubleSort()
   {
	   int a[]= {4,8,9,1,10,5,12,6},
			   temp;
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=0;j<a.length-1;j++)
		   {
			   if(a[j]<a[j+1])
			   {
				   temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
			   }
		   }
	   }
	   for(int k=0;k<a.length;k++)
	   {
	   System.out.println(a[k]);
   }
   }@Test
   void bubbleSorting()
   {
	   int a[]= {4,8,9,1,10,5,12,6},temp;
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
	   for(int k=0;k<a.length;k++)
	   System.out.println(a[k]);
	   
   }
}