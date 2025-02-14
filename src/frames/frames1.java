package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
      ChromeDriver malavikha=new ChromeDriver();
      malavikha.get("https://jqueryui.com/droppable/");
      malavikha.manage().window().maximize();
   WebElement Frame=   malavikha.findElement(By.className("demo-frame"));
   malavikha.switchTo().frame(Frame);
   
   WebElement drag=malavikha.findElement(By.id("draggable"));
    String dragText=drag.getText();
    System.out.println(dragText);
  WebElement drop= malavikha.findElement(By.id("droppable"));
  System.out.println(drop.getText()); 
  Actions action=new Actions(malavikha);
  action.dragAndDrop(drag, drop).build().perform();
  malavikha.switchTo().defaultContent();
 WebElement ResizableProperty= malavikha.findElement(By.linkText("Resizable"));
 ResizableProperty.click();
   WebElement manasa= malavikha.findElement(By.linkText("Sortable"));
        manasa.click();
  
   
      
	}

}
