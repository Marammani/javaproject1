package Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
ChromeDriver malavikha=new ChromeDriver();
malavikha.get("https://login.salesforce.com/?locale=in");
malavikha.manage().window().maximize();

      WebElement Username=malavikha.findElement(By.id("username"));
      Username.sendKeys("manikanta");
      
      WebElement userpassword= malavikha.findElement(By.id("password"));
     userpassword.sendKeys("ihatelovestories");
     
        String userid =Username.getAttribute("value");
         System.out.println(userid);
       String pwd=userpassword.getAttribute("value");
       System.out.println(pwd);
       
       if(userid.equals(pwd))
       {
    	   System.out.println("true");
       }
       else
       {
    	   System.out.println("false");
       }
       malavikha.findElement(By.id("Login")).click();
       
	}

}
