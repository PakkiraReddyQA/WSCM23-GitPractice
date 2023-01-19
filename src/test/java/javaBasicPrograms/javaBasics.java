package javaBasicPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class javaBasics {
	Scanner sc=new Scanner(System.in);
	@Test
	public void primeNumber()
	{
	
		System.out.println("Enter Num");
		int num = sc.nextInt(),count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not prime number");
		
	}
	@Test
	public void print1To100()
	{
		for(int num=1;num<=10;num++)
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
				System.out.println(num+"prime numbers");
		}
	}
	@Test
	public void factorial()
	{
		int num=5,fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	@Test
	public void revrseNumber()
	{
		int num=2312,rev=0,rem;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}
	@Test
	public void palindromeNumber()
	{
		int num=121,rev=0,rem,cp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(rev==cp)
			System.out.println(rev+" is palindrome number");
		else
			System.out.println(rev+" is not palindrome number");
	}
	@Test
	public void armStrongNumber()
	{
		int num=153,rem,arm=0,cp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		if(arm==cp)
		System.out.println(arm+" is armstrong number");
		else
			System.out.println(arm+" is not armstrong number");
	}
	@Test
	public void addEvenNumbers()
	{
		int num=13246879,sum=0;
		while(num>0)
		{
			int rem=num%10;
		if(rem%2==0)
			sum=sum+rem;
		num=num/10;
		
		}
		System.out.println(sum+" is addition of Even Numbers");
	}
	@Test
	public void addODDnUmbers()
	{
		int num=784359178,sum=0;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			if(rem%2!=0)
				sum=sum+rem;
		}
		System.out.println(sum+" is addtion of Odd numbers+");
	}
	@Test
	public void bubbleSort()
	{
		int a[]= {5,8,1,9,2};
		int temp;
		for(int i=0;i<=a.length;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
				    a[j]=a[j+1];
				    a[j+1]=temp;
		   }
			}
		}
		System.out.println(toString());
}
}
