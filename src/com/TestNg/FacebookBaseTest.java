package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FacebookBaseTest {
	WebDriver malavikha;
	String applicationUrlAddress="https://www.facebook.com/login/";
	@BeforeTest
	public void applicationLaunch()
	{
		malavikha=new ChromeDriver();
		malavikha.get(applicationUrlAddress);
		malavikha.manage().window().maximize();
		
	}
	@AfterTest
	public void applicationClose()
	{
		malavikha.quit();
	}
	
	
	
	

}
