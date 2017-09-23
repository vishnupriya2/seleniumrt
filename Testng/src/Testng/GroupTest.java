package Testng;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups="kitkat")
	public void kitkat()
	{
		System.out.println("Test for good kitkat");
	}
	@Test(groups="kitkat1")
	public void kitkat1()
	{
		System.out.println("Test for bad kitkat");
	}
	@Test(groups="munch")
	public void munch()
	{
		System.out.println("Test for good munch");
	}
	@Test(groups="munch1")
	public void munch1()
	{
		System.out.println("Test for bad munch");
		
	}
	@Test(groups="diarymilk")
	public void diarymilk()
	{
		System.out.println("Test for good diarymilk");
		
	}
	@Test(groups="diarymilk1")
	public void diarymilk1()
	{
		System.out.println("Test for bad diarymilk");
		
	}
	
	
	
	

}
