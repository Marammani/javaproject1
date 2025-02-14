package scrolloperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolloperationexample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("https://the-internet.herokuapp.com/");
		malavikha.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)malavikha;
		//1.using as pixels
		//js.executeScript("window.scrollBy(0,500)", "");
		//Thread.sleep(5000);
		//js.executeScript("window.scrolBy(0,-1000)", "");
		
//visibility of webelement
	////WebElement contextmenu=	malavikha.findElement(By.linkText("Context Menu"));
	
//js.executeScript("arguments[0].scrollIntoView();",contextmenu);
		
		//bottom of webpage
   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
		
		
		
	}

}
