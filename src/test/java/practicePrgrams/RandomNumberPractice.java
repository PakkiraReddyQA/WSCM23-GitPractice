package practicePrgrams;

import java.util.Random;

import org.testng.annotations.Test;

public class RandomNumberPractice {
	@Test
	public void getRandomNumber()
	{
		Random ran=new Random();
		int value = ran.nextInt(600);
		System.out.println(value);
		
	}

}
