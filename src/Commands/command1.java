package Commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class command1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
ChromeDriver malavikha=new ChromeDriver();
malavikha.get("https://www.meesho.com/");
malavikha.manage().window().maximize();
System.out.println(malavikha.getPageSource());
String title=malavikha.getTitle();
System.out.println(title);
String manasa =malavikha.getCurrentUrl();
System.out.println(manasa);
         malavikha.navigate().to("https://www.ajio.com/");	
         malavikha.navigate().back();
         malavikha.navigate().forward();
         malavikha.navigate().refresh();
         malavikha.close();
         malavikha.quit();
         
 
 

	}

}


	


