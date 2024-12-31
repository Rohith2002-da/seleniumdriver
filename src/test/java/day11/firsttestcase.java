package day11;

import org.testng.annotations.Test;

public class firsttestcase {
/*
 1.open app
 2.login
 3.logout
 */
	@Test(priority=1)
	void openapp() {
		System.out.println("open app");	
		}
	
	
	@Test(priority=3)
	void logout() {
		System.out.println("logout");	

	}
	
	@Test(priority=2)
	void login() {
		System.out.println("login");	

	}
	
}
