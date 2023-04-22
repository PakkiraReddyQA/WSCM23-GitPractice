package javaBasicPrograms;

public class CountSpaces {
	public static void main(String[] args) {
		
		String str="pakkira reddy y ".trim();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
