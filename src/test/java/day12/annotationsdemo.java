package day12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationsdemo {

	/*
	 * 1.login -@beforemethod
	 * 2.search-@test
	 * 3.logout-@aftermethod
	 * * 1.login -@beforemethod
	 * 2.advancedsearch-@test
	 * 3.logout-@aftermethod
	 */
	@BeforeMethod
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
	
	@AfterMethod
	void logout() {
		System.out.println("logout");
	}
	
}
