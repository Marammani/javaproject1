package com.TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {
	@Test
	@Parameters({"username","password"})
	public void LoginTest(String user,String pass)
	{
	
		System.out.println("username:"+user);
		System.out.println("password:"+pass);
		ChromeDriver malavikha =new ChromeDriver();
		malavikha.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		
		
		
	}
	
	
	
	
	}
	
	
	
	
	


