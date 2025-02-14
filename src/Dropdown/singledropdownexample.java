package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
ChromeDriver malavikha=new ChromeDriver();
    malavikha.get("https://omayo.blogspot.com/");
    malavikha.manage().window().maximize();
  //  malavikha.findElement(By.id("drop1"));
    WebElement manasa= malavikha.findElement(By.id("drop1"));
    Select malavikhareddy=new Select(manasa);
     List<WebElement>reddy= malavikhareddy.getOptions();
         int reddycount=reddy.size();
         System.out.println(reddycount);
         //foreach
//            for(int i=0;i<reddy.size();i++)
//            {
//            	System.out.println(reddy.get(i).getText());
//            }
            //nhancedforloop
            for(WebElement option:reddy)
            {
            	System.out.println(option.getText());       
            }
           malavikhareddy.selectByIndex(3);
           
            
           malavikhareddy.selectByValue("def");
           Thread.sleep(3000);
           malavikhareddy.selectByVisibleText("doc 2");
          WebElement agnimitra= malavikhareddy.getFirstSelectedOption();
          System.out.println(agnimitra.getText());
         List<WebElement>allOptions= malavikhareddy.getAllSelectedOptions();
         for(WebElement index:allOptions)
         {
        	 System.out.println(index.getText());
         }
  
    
    
	}

}
 