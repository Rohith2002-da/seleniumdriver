package day13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionsdemo {

@Test	
void testtitle() {
	String exp="opencart";
	String act="opencart";
	Assert.assertEquals(exp, act);
}
}
