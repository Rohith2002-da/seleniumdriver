package day16;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class listeer {

	@BeforeTest
	void login() {
		System.out.println("login");
	}
	
	@Test
	void search() {
		System.out.println("search");	
	}
	
	@Test()
	void advancedserch() {
		System.out.println("advancedsearch");
	}
	
	@Test
	void cart() {
		System.out.println("cart");
	}
	
	@AfterTest
	void logout() {
		System.out.println("logout");
	}
	
	@BeforeSuite
	void beforelogin() {
		System.out.print("beforelogin");
	}
	
	@AfterSuite
	void afterlogout() {
		System.out.print("afterlogout");	
	}
}
