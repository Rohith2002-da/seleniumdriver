package day12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class beforeafterclass {
	/*
	 * 1.login -@beforeclass-executes only once
	 * 2.search-@test
	 * 3.advancedsearch-@test
	 * 4.logout-@afterclass-executes only one class
	 * 
	 * 
	 */
	@BeforeClass
	void login() {
		System.out.println("login");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("search");	
	}

	@Test(priority=2)
	void advancedserch() {
		System.out.println("advancedsearch");
	}
	
	@AfterClass
	void logout() {
		System.out.println("logout");
	}	

}
