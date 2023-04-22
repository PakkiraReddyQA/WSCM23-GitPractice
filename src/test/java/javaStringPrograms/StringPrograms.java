package javaStringPrograms;

import org.testng.annotations.Test;

public class StringPrograms {
	public static void main(String[] args) {
		String s="I am test Engineer";
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
	void StringToArray()
	{
		String s="I am test Engineer";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	@Test
	void LongestWord()
	{
		String s="I am test Engineer";
		String[] str = s.split(" ");
		String max=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(str[i].length()>max.length())
			{
				max=str[i];
			}
		}
		System.out.println(max);
	}
	@Test
	void reverseWords()
	{
		String s="I am test Engineer";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		
	}
@Test
void frequencyLetter()
{
	String s="i am test engineer";
	char[] ch = s.toCharArray();
	
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A')
			{
			count++;
			if(count>0)
				System.out.println(ch[i]+"--->"+count);
			}
			
		}
	}
	
	@Test
	void stringTochar()
	{
		String s="I am Test Engineer";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
	}
	


