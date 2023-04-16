package Testcases;

import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
   
	
	@Test(dependsOnMethods ="test2")//if we want to exclude test 1 then use (enabled=false) Method 1, Prioority is given using (priority=0) or 1 ,2,3,4 ...
	public void test1() {
		System.out.println("Inside Home Loan Test 1");
	}

	@Test(groups= {"sanity","regression"})
	public void test2() {
		System.out.println("Inside Home loan Test 2");
	}

	
}



