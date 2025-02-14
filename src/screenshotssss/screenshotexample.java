package screenshotssss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotexample {

	public static void main(String[] args) throws IOException {
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("https://www.facebook.com/");
		malavikha.manage().window().maximize();
		//full screenshot
    // File screenshot= ((TakesScreenshot)malavikha).getScreenshotAs(OutputType.FILE);
   // FileUtils.copyFile(screenshot, new File(".\\screenshot\\facebookhomepage.png"));
  //WebElement facebookTable=malavikha.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form"));
  //File screenshot=facebookTable.getScreenshotAs(OutputType.FILE);
 //FileUtils.copyFile(screenshot, new File(".\\screenshot\\facebookTable.png"));
   //   WebElement logo= malavikha.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div"));
    //  File screenshot=logo.getScreenshotAs(OutputType.FILE);
    //  FileUtils.copyFile(screenshot, new File(".\\screenshot\\facebooklogo.png"));
		 WebElement email=malavikha.findElement(By.id("email"));
		File screenshot= email.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\screenshot\\facebookemail.png"));
	}

}
