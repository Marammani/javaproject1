package Radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
ChromeDriver malavikha=new ChromeDriver();
    malavikha.get("https://echoecho.com/htmlforms10.htm");
    malavikha.manage().window().maximize();
    
    
    
   WebElement tableproperty= malavikha.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/span[7]"));
              List<WebElement>vcm=malavikha.findElements(By.name("group1"));
         
            System.out.println(vcm.size());
         List<WebElement>  vcm1= malavikha.findElements(By.name("group2"));
         System.out.println(vcm1.size());
         
         
         
          
	}
	

}
