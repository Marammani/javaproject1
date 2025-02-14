package tabhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singletab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("https://accounts.google.com/"); 
		malavikha.manage().window().maximize();
		WebElement help=malavikha.findElement(By.linkText("Help"));
		String handle=malavikha.getWindowHandle();
		System.out.println(handle);
		help.click();
		Set<String> handles=malavikha.getWindowHandles();
		System.out.println(handles);
		if(handle.equals(handles))
				{
			System.out.println("true");
				}
		else
		{
			System.out.println("false");
		}

		
		
		   
		
		

		

	}

}
