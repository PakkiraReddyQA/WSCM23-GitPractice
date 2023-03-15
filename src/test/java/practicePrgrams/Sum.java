package practicePrgrams;

import org.testng.annotations.Test;

public class Sum 
{
	@Test
	public void TotalSum()
	{
		int Tsum=0;
		
		for(int i=0; i<=5; i++)
		{
			Tsum+=i;
		}
		System.out.println(Tsum);
	}

}
