package com.TestNg;

import org.testng.annotations.Test;

public class GroupingTest {
	@Test(groups="sanity")
	public void Test1()
	{
		System.out.println("sanity test is successful");
	}
	@Test(groups="regression")
	public void Test2()
	{
		System.out.println("regression test is successful");
	}
	
	@Test(groups="regression,sanity")
	public void Test3()
	{
		System.out.println("both regression and sanity test is successful");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
