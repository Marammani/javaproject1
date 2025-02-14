package validatinganapplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class validatingapplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe");
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("https://www.orangehrm.com/");
		malavikha.manage().window().maximize();
		  
		String expectedtitle="Resources";
		 System.out.println(expectedtitle);
		
		 String actualresult= malavikha.getTitle();
		System.out.println(actualresult);
		
		if(expectedtitle.equals(actualresult))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(expectedtitle.equalsIgnoreCase(actualresult))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(actualresult.contains(expectedtitle))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(expectedtitle.contains(actualresult))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
