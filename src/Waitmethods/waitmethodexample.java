package Waitmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitmethodexample {

	public static void main(String[] args) {
	ChromeDriver malavikha=new ChromeDriver();
	malavikha.get("https://www.facebook.com/");
	malavikha.manage().window().maximize();
	 WebElement user=malavikha.findElement(By.id("email"));
	 user.sendKeys("7993566588");
	 WebElement pass=malavikha.findElement(By.id("pass"));
	 pass.sendKeys("akka7819");
	 malavikha.findElement(By.name("login")).click();
	 WebElement user1=malavikha.findElement(By.id("email"));
	 user1.sendKeys("7993566588");
	 WebElement pass1=malavikha.findElement(By.id("pass"));
	 pass1.sendKeys("akka7819");
	 malavikha.findElement(By.name("login")).click();
	 

	 
	 


	 

	}

}
