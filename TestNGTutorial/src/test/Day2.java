package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups = {"smoke"})	
	public void loan()
	{
		System.out.println("GOod --Day02");
	}
	
	
	@AfterTest
	public void prereqiusted()
	{
		System.out.println("I will execute first ---Day 02");
	}
}
