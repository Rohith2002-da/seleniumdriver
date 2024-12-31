package day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {
    @Test(priority=0)
	void openapp() {
		Assert.assertTrue(true);
	}
	
    @Test(priority=1,dependsOnMethods= {"openapp"})
	void login() {
		Assert.assertTrue(false);

    }
    @Test(priority=2,dependsOnMethods= {"login","openapp"})
	void search() {
		Assert.assertTrue(true);

	}
	
    @Test(priority=3,dependsOnMethods= {"login"})
	void advsearch() {
		Assert.assertTrue(true);

	}
	
    @Test(priority=5,dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
}
