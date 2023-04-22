package javaBasicPrograms;

public class SumofDigits {
public static void main(String[] args) {
	int num=123245,sum=0,rem;
	while(num>0)
	{
		if(num%2==0)
		{
		rem=num%10;
		sum=sum+rem;
		}
		num=num/10;
	}
	System.out.println(sum);
}
}
