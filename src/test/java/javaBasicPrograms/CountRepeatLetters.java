package javaBasicPrograms;

public class CountRepeatLetters {
    public static void main(String[] args) {
    	String str="pakkira reddy";
    	int count=0;
    	for(int i=0;i<str.length();i++)
    	{
    		char ch=str.charAt(i);
    		if(ch=='d')
    		{
    			count++;
    		}
    	}
    	System.out.println(count);
}
}
