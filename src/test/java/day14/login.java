package day14;

import org.testng.annotations.Test;

public class login {

	@Test(priority=1,groups= {"sanity"})
	void loginfacebook() {
		System.out.println("loginfacebook");	
	}
	
	@Test(priority=2,groups= {"sanity"})
	void logintwitter() {
		System.out.println("logintwitter");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void logininstagram() {
		System.out.println("logininstagram");
	}
}
