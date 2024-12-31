package day13;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	@BeforeTest
	void login() {
		System.out.println("login");
	}
	
	@Test
	void search() {
		System.out.println("search");	
	}
}
