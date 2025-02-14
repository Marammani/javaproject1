package com.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OHRMbasetext {
	 WebDriver malavikha;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeMethod
	public void applicationLaunch()
	{
		malavikha=new ChromeDriver();
		malavikha.get(applicationUrlAddress);
		malavikha.manage().window().maximize();
		malavikha.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		
		
		
	}
	@AfterMethod
	public void applicationClose()
	{
		malavikha.quit();
	}
	
	
	

}
