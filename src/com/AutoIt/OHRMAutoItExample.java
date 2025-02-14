package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMAutoItExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver mounika=new ChromeDriver();
		mounika.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
       mounika.manage().window().maximize();
       mounika.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       mounika.findElement(By.id("txtUsername")).sendKeys("admin");
       mounika.findElement(By.id("txtPassword")).sendKeys("Manikanta@123");
       mounika.findElement(By.id("btnLogin")).click();
       mounika.findElement(By.id("menu_pim_viewPimModule")).click();
       mounika.findElement(By.id("menu_pim_addEmployee")).click();
       mounika.findElement(By.id("firstName")).sendKeys("maram");
       mounika.findElement(By.id("lastName")).sendKeys("manikanta");
     WebElement photofile=  mounika.findElement(By.id("photofile"));
     
     JavascriptExecutor js=(JavascriptExecutor)mounika;
     js.executeScript("arguments[0].click();",photofile);
     
     Thread.sleep(5000);
     
     Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\browserfiles\\photo.exe");
     
     
      mounika.findElement(By.id("btnSave")).click();  
	}

}
