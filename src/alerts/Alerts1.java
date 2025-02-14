package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
	      ChromeDriver malavikha=new ChromeDriver();
	      malavikha.get("https://omayo.blogspot.com/");
	      malavikha.manage().window().maximize();
	     WebElement alertProperty= malavikha.findElement(By.id("alert1"));
	     alertProperty.click();
	   Alert alertText=  malavikha.switchTo().alert();
	        String alertbox=alertText.getText();
	        System.out.println(alertbox);
	       // alertText.accept();
	        malavikha.switchTo().alert().dismiss();
	        
	     

	}
}
