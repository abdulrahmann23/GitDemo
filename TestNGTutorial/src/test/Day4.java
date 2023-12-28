package test;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHome-- Day 04");
	}
	
	
	@Test
	//(dependsOnMethods= {"WebLoginHomeLoan"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome-- Day 04");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APILoginHome-- Day 04");
	}


}


	
	
	