package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotation {
	@Test()
	public void test()
	{
		System.out.println("this is my first text caseee ");
	}
	@BeforeMethod()
	public void beforemethod()
	{
		System.out.println("this will execute before every method");
	}
	@AfterMethod()
	public void aftermethod()
	{
		System.out.println("this will execute aftre every method");
	}
	@BeforeClass()
	public void beforeclass()
	{
		System.out.println("this will execute before every class");
	}
	@AfterClass()
	public void aftreclass()
	{
		System.out.println("this will execute aftre every class");
	}
	@BeforeTest()
	public void beforetext()
	{
		System.out.println("this will execute before every test");
	}
	@AfterTest()
	public void aftertext()
	{
		System.out.println("this will execute aftre every text");
	}
	@BeforeSuite()
	public void beforesuit()
	{
		System.out.println("this will execute before every suit");
	}
	@AfterSuite()
	public void aftersuite()
	{
		System.out.println("this will execute aftre every suite");
	}
	
	
	
	
	
	
	
	
	

}
