package Commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class commands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
    ChromeDriver mounika = new ChromeDriver();
    mounika.get("https://www.flipkart.com/");
    mounika.manage().window().maximize();
   System.out.println(mounika.getPageSource());
   String title=mounika.getTitle();
   System.out.println(title);
  String manasa =mounika.getCurrentUrl();
  System.out.println(manasa);
            mounika.navigate().to("https://www.amazon.in/");	
            mounika.navigate().back();
            mounika.navigate().forward();
            mounika.navigate().refresh();
            mounika.close();
            mounika.quit();
            
    
    

	}

}
