package javaStringPrograms;

import org.testng.annotations.Test;

public class StringPracticePrograms {
	@Test
	void reveseString()
	{
		String s="pakkira reddy";
		String rev = " ";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
	@Test
	void palindromeString()
	{

		String s="Mom";
		String rev = " ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
			System.out.println(rev+" is palindrome string");
		else
			System.out.println(rev+" is not palindrome string");
	}
	@Test
	void CountWords()
	{
		String s="I am pakki ra reddy ".trim();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch==' ')
				count++;
		}
		System.out.println(count);
	}
	@Test
	void StringToArry()
	{
		String s="I am pakki ra reddy ";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	@Test
	void reverseWords()
	{
		String s="I am pakki ra reddy ";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
	}
	@Test
	void printLongWord()
	{
		String s="I am pakki ra eddy ";
		String[] str = s.split(" ");
		String max = str[0];
		for(int i=0;i<str.length-1;i++)
		{
			if(str[i].length()>max.length())
				max=str[i];
		}
		System.out.println(max);
	}
	@Test
	void frequencyLetter()
	{
		String s="I am pakki ra reddy ";
		String str = s.toLowerCase();
		char[] ch = str.toCharArray();
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
			System.out.println(k+"---->"+count);
		}
	}

}
