package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
ChromeDriver obj=new ChromeDriver();

obj.get("https://www.facebook.com/");
obj.manage().window().maximize();
//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" 
//data-testid="royal-email" placeholder="Email address or phone number" 
//autofocus="1" aria-label="Email address or phone number">

       //id
//obj.findElement(By.id("email")).sendKeys("manikanta");

        //WebElement id=obj.findElement(By.id("email"));
        //id.sendKeys("manual");
      //name
  // obj.findElement(By.name("email")).sendKeys("testing");

   //classname
  // obj.findElement(By.className("inputtext")).sendKeys("manikantamaram");
        

      //tagname
  //List<WebElement> link=obj.findElements(By.tagName("a"));
  // System.out.println(link.size());

       //xpath
//WebElement email=obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
  //email.sendKeys("maram"); 

//relative xpath
//WebElement emailid=obj.findElement(By.xpath("//*[@id=\"email\"]"));
//emailid.sendKeys("livetech");

//css selector
WebElement raja=obj.findElement(By.cssSelector("#email"));
raja.sendKeys("pawankalayan");

    //link text
//obj.findElement(By.linkText("Forgotten password?")).click();
//obj.findElement(By.partialLinkText("Forgotten ")).click();

	}

}
