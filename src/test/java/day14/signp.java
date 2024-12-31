package day14;

import org.testng.annotations.Test;

public class signp {

	@Test(priority=1,groups= {"regression"})
	void signupfacebook() {
		System.out.println("signupfacebook");	
	}
	
	@Test(priority=2,groups= {"regression"})
	void signuptwitter() {
		System.out.println("signuptwitter");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signupinstagram() {
		System.out.println("signupinstagram");
	}
}
