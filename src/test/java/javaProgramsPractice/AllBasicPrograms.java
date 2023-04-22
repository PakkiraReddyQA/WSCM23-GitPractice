package javaProgramsPractice;

import org.testng.annotations.Test;

public class AllBasicPrograms {
	
	/**
	 * This methods will swap the numbers
	 * @param args
	 */
	public static void main(String[] args) {
		int a=10,b=20,c;
		System.out.println("Before swapping"+a+" "+b);
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b+" After Swapping");
	}
	/**
	 * This methods will swap the numbers
	 */
	@Test
	public void swapping()
	{
		int a=10,b=20;
		System.out.println("Before swapping"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b+" After Swapping");
	}
	/**
	 * Finding Factorial of NUmber
	 */
	@Test
	public void factorial()
	{
		int num=7,fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	/**
	 * This method will revsrse the Given NUmber
	 */
	@Test
	public void reverseNumber()
	{
		int num=453,rev=0,rem;
		while(num>0)
		{
		rem=num%10;
		num=num/10;
		rev=rev*10+rem;
		}
		System.out.println(rev);
	}
	/**
	 * Palindrome Number
	 */
	@Test
	void palindrome()
	{
		int num=121,rev=0,rem,cp=num;
		while(num>0)
		{
			 rem=num%10;
			 num=num/10;
			 rev=rev*10+rem;
		}
		if(rev==cp)
		{
			System.out.println(rev+" is palindrome Number");
	     }
		else
			System.out.println(rev+" is not a palindrome Number");
		}
	/**
	 * Armstrong Number Program
	 */
	@Test
	void armStrong()
	{
		
		int num=153, rem,arm=0,cp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		
		if(arm==cp)
		System.out.println(arm+" is arm strong number");
		else
		System.out.println(arm+"is not armstrong number");
	}
	/**
	 * sum  the only Even Numbers from given  didgit only 
	 */
	@Test
	void sum()
	{
		int num=123456,sum=0,rem;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
			sum=sum+rem;
			}
			num=num/10;
			
		}
		System.out.println(sum+" Sum of the numbers");
	}
	/**
	 * count frequency of letters
	 */
	@Test
	void frequency()
	{
		String s="pakkiraReddy";
		char[] arry = s.toCharArray();
		for(char k='a';k<='z';k++)
		{
			int count=0;
			for(int i=0;i<arry.length;i++)
			{
				if(arry[i]==k)
				{
					count++;
				}
			}
			if(count>0)
			System.out.println(k+"-->"+count);
		}
	}
	
	@Test
	void length()
	{
		String s="PakkiraReddy";
		char[] ch = s.toCharArray();
		int c=0;
		for(char k:ch)
		{
			c++;
		}
		System.out.println(c);
	}
	@Test
	void frequencyletters()
	{
		String s="pakkirareddy";
		char[] ch = s.toCharArray();
		for(char k='a';k<='z';k++)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==k)
				{
					count++;
				}
			}
			if(count>0)
			System.out.println(k+"-->"+count);
		}
	}
	@Test
	void charcters()
	{
		String s="reddy";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
	}
	}

