package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Parameters({"URL","APIKey/usrnsme"})
	@Test(groups = {"smoke"})
	public void WebLoginCarLoan( String URLname, String key)
	{
		System.out.println("WebLoginCar-- Day 03");
		System.out.println(URLname);
		System.out.println(key);
	}
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String Username, String Password)
	{
		System.out.println("Mobile Signout");
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am running before suite --- Day 03");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCar-- Day 03");
	}
	
	@Test(dependsOnMethods = {"WebLoginCarLoan"})
	public void LoginAPICarLoan()
	{
		System.out.println("APILoginCar-- Day 03");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination -- username , password  --good credit history
		//2nd ---- username password ---no credit history
		//3rd --- fraudelent credit history
		
		//3rows and 2 columns ie 2 data value (username,password)
		
		Object[][] data = new Object[3][2];
		//1st set of data
		data[0][0] = "firstsetusername";
		data[0][1]= "password";
		//2nd data set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		//3rd data set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}

}
