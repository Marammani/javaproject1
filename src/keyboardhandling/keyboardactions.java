package keyboardhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {



	public static void main(String[] args) {
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("https://demoqa.com/text-box");
		malavikha.manage().window().maximize();
	WebElement username=malavikha.findElement(By.id("userName"));
	username.sendKeys("manikanta");
	
	 WebElement email=malavikha.findElement(By.id("userEmail"));
	 email.sendKeys("marammanikanta2@gmail.com");
	 
	 WebElement  current =malavikha.findElement(By.id("currentAddress"));
	 current.sendKeys("ameerpet",     "hyderabad");
	 
	 
	   WebElement permanent=malavikha.findElement(By.id("permanentAddress"));
	   Actions action=new Actions(malavikha);
	   
	   //ctrl+a
	   action.keyDown(Keys.CONTROL);
	   action.sendKeys("a");
	   action.keyUp(Keys.CONTROL);
	   action.perform();
	   
	   //ctrl+c
	   action.keyDown(Keys.CONTROL);
	   action.sendKeys("c");
	   action.keyUp(Keys.CONTROL);
	   action.perform();
	   
	   //tab actions
	   action.sendKeys(Keys.TAB);
	   action.perform();
	   
	   //ctrl+v
	   action.keyDown(Keys.CONTROL);
	   action.sendKeys("v");
	   action.keyUp(Keys.CONTROL);
	   action.perform();
	   
	   if(current.getAttribute("value").equals(permanent.getAttribute("value")))
			   {
		   System.out.println("current and permanent is same-pass");
			   }
	   else
	   {
		   System.out.println("current is not same as permanent -fail");
		   
		   
	   }


	   
	 
	 
	}

}
