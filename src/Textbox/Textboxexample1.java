package Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe" );
		     ChromeDriver malavikha=new ChromeDriver();
		     malavikha.get("https://www.facebook.com/login.php/");
		     malavikha.manage().window().maximize();
		 WebElement username=   malavikha.findElement(By.id("email"));
		  username.sendKeys("malavikha");
		WebElement userpassword=  malavikha.findElement(By.id("pass"));
		userpassword.sendKeys("reddy");
		
		String userid =username.getAttribute("value");
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
      malavikha.findElement(By.id("loginbutton")).click();
      
	}

}

	


