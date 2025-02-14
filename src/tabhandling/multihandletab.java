package tabhandling;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multihandletab {

	public static void main(String[] args) {
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("https://www.youtube.com/");
		malavikha.manage().window().maximize();
		malavikha.switchTo().newWindow(WindowType.TAB);
		malavikha.get("https://www.google.com/maps");
		malavikha.switchTo().newWindow(WindowType.TAB);
		malavikha.get("https://www.google.com/maps");
		malavikha.switchTo().newWindow(WindowType.TAB);
		malavikha.get("https://www.selenium.dev/downloads/");
		malavikha.switchTo().newWindow(WindowType.WINDOW);
		malavikha.get("https://www.w3schools.com/");
		malavikha.switchTo().newWindow(WindowType.WINDOW);
		malavikha.get("https://www.facebook.com/");
		malavikha.switchTo().newWindow(WindowType.WINDOW);
		malavikha.get("https://www.youtube.com/");
		
		
		
		
		

		

	}

}
