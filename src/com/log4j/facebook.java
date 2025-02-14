package com.log4j;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		ChromeDriver malavikha=new ChromeDriver();
		malavikha.get("https://www.facebook.com/");
		malavikha.manage().window().maximize();
		//System.out.println("testing");
		log.info("malavikha");
		

	}

}
