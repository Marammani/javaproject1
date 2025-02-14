package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
      ChromeDriver obj1=new ChromeDriver();
      obj1.get("https://www.facebook.com/");
      obj1.manage().window().maximize();
      //<input type="password" class="inputtext _55r1 _6luy _9npi" 
           // name="pass" id="pass" data-testid="royal-pass" 
    		//  placeholder="Password" aria-label="Password">
      //id
      //obj1.findElement(By.id("pass")).sendKeys("manual");
      
      //id
    WebElement vcm1= obj1.findElement(By.id("pass"));
   vcm1.sendKeys("testing");
      
     
      //name
     //obj1.findElement(By.name("pass")).sendKeys("testing");
      
      //classname
      //obj1.findElement(By.className("inputtext")).sendKeys("automation");
      
      //xpath
     // WebElement  manasa=obj1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
      //manasa.sendKeys("selenium");
      
      //relative xpath
    // WebElement sufiya= obj1.findElement(By.xpath("//*[@id=\"pass\"]"));
     //sufiya.sendKeys("fullstack");
     
     //css selector
     // WebElement vcm=obj1.findElement(By.cssSelector("#pass"));
      //vcm.sendKeys("manimaram");
      
      // linktext
      //obj1.findElement(By.linkText("Create a Page")).click();
     // obj1.findElement(By.partialLinkText("Create ")).click();
      
      
      //tagname
          //List<WebElement>link1 =obj1.findElements(By.tagName("body"));
          //System.out.println(link1.size());
          
          
     
     
	}
	

}
