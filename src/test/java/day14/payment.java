package day14;

import org.testng.annotations.Test;

public class payment {

	@Test(priority=1,groups= {"sanity","regression"})
	void paymentinruppes() {
		System.out.println("paymentinruppes");
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	void paymentindollars() {
		System.out.println("paymentindollars");
	}
}
