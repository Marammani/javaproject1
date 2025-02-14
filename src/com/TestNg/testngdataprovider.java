package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngdataprovider {
	@DataProvider(name="loginDta")
	public Object[][] getdata(){
		return new Object[][] {
			{"admin","manikanta"},
			{"manikanta","Manikanta@123"},
			{"maram","malavikaha"},
			{"admin","Manikanta@123"}
			
		};
	}
	@Test(dataProvider="loginDta")
	public void LoginTest(String username,String password)
	{
		System.out.println("UserName:"+username+","+"PassWord:"+password);
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		malavikha.manage().window().maximize();
		
		 WebElement userName= malavikha.findElement(By.id("txtUsername"));
		 userName.sendKeys(username);
		 WebElement userPass= malavikha.findElement(By.id("txtPassword"));
		 userPass.sendKeys(password);
		 malavikha.findElement(By.id("btnLogin")).click();
		
	}
	
		
		
		
		
		
		
	
	
	
	
	
	

}
