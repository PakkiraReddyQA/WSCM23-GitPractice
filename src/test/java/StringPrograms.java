import org.testng.annotations.Test;

public class StringPrograms {
	//Count, print  Vowels in the Name
	@Test
	void RepetLetters()
	{
		String str="pakkirarEddey";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		    if(ch=='E'||ch=='e')
		    	count++;
		    System.out.println(ch);
		}
		System.out.println(count);
	}
	//count vowels in Name
	@Test
	void vowels()
	{
	String str="pakkirareddy";
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A')
			count++;
	}
	System.out.println(count);
	}
	//Count spaces Progarm
	@Test
	void countSpaces()
	{
		String s=" pa kki ra reddy ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch==' ')
				count++;	
		}
		System.out.println(count);
	}
	@Test
	void countWords()
	{
		String s="pa kki ra reddy";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch==' ')
				count++;
			}
		System.out.println(count);
		}
	/**
	 * Reverse String
	 */
	@Test
	void reverse()
	{
		String s="pakkira";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	//Palindrome String
	@Test
	void palindromeString()
	{
		String s="Moml";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+ s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
			System.out.println(rev+" is palindrome String");
		else
			System.out.println(rev+" is not palindrome String");
	}
	@Test
	void stringToArry()
	{
		String s="pakki ra reddy";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	@Test 
	void ReverseString()
	{
		String s="pakkira reddy y";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
	}
	@Test
	void frequencyWord()
	{
		String s="we are are we";
		String[] str = s.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("we"))
				count++;
		}
		System.out.println(count);
	}
	}


