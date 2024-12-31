package day13;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {

	@Test(priority=2)
	void advancedserch() {
		System.out.println("advancedsearch");
	}
	
	@AfterTest
	void logout() {
		System.out.println("logout");
	}
}
