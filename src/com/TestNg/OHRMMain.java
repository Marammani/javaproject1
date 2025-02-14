package com.TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OHRMMain extends OHRMbasetext {
	@Test
	public void LoginTest()
	{
		WebElement userName= malavikha.findElement(By.id("txtUsername"));
		 userName.sendKeys("admin");
		 WebElement userPass= malavikha.findElement(By.id("txtPassword"));
		 userPass.sendKeys("Manikanta@123");
		 malavikha.findElement(By.id("btnLogin")).click();	
	}
	
	@Test
	public void logOut()
	{
		WebElement userName= malavikha.findElement(By.id("txtUsername"));
		 userName.sendKeys("admin");
		 WebElement userPass= malavikha.findElement(By.id("txtPassword"));
		 userPass.sendKeys("Manikanta@123");
		 malavikha.findElement(By.id("btnLogin")).click();	
		malavikha.findElement(By.id("welcome")).click();
		malavikha.findElement(By.linkText("Logout"));
		
		//implict wait
		   //  By logOutProperty=By.linkText("Logout");
		    // WebDriverWait wait=new WebDriverWait(malavikha,Duration.ofSeconds(30));
		    // wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));
		// WebElement logout=malavikha.findElement(logOutProperty);
		// logout.click();
		
		
	}
	
	
	

}
