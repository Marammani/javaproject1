package MOUSEOVER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveractionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
ChromeDriver malavikha=new ChromeDriver();
malavikha.get("https://greenstechnologys.com/index.html"); 
malavikha.manage().window().maximize();

WebElement mouse=malavikha.findElement(By.linkText("COURSES"));
Actions actions=new Actions(malavikha);
actions.moveToElement(mouse).build().perform();

WebElement vcm=malavikha.findElement(By.linkText("PMP Training"));
Actions actions1=new Actions (malavikha);
actions1.moveToElement(vcm).build().perform();

 
 


	}

}
