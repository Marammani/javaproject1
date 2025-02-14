package validatinganapplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class validatingappexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\eclipse-workspace\\automation\\browserfiles\\chromedriver.exe ");
ChromeDriver vcm=new ChromeDriver();
vcm.get("https://www.bing.com/");
vcm.manage().window().maximize();
     String  expectedtitle=" Microsoft Bing";
     System.out.println(expectedtitle);
      String actualtitle=vcm.getTitle();
      System.out.println(actualtitle);
      
      if(expectedtitle.equals(actualtitle))
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("false");
      }
      if(expectedtitle.equalsIgnoreCase(actualtitle))
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("false");
      }
      if(expectedtitle.contains(actualtitle))
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("false");
      }
      if(actualtitle.contains(expectedtitle))
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("false");
      }
      vcm.close();
      
	}

}
