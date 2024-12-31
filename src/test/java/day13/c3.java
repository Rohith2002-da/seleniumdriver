package day13;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {

	@Test
	void cart() {
		System.out.println("cart");
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
