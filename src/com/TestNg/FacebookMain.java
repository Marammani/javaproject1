package com.TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookMain extends FacebookBaseTest {
	@Test
	public void FacebookLogintext()
	{
	malavikha.findElement(By.id("email")).sendKeys("9666648799");
	malavikha.findElement(By.id("pass")).sendKeys("Mani@1234");
	malavikha.findElement(By.name("login")).click();
		
		
		
		
	}
	

}
