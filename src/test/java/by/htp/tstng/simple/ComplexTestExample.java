package by.htp.tstng.simple;

import org.testng.annotations.Test;

public class ComplexTestExample {
	
	@Test(groups = {"chrome", "firefox"})
	public void testSmth1() {
		System.out.println("2 - @Test1");
	}
	
	@Test(groups = {"chrome", "firefox"})
	public void testSmth2() {
		System.out.println("2 - @Test2");
	}
	@Test(groups = {"chrome"})
	public void testSmth3() {
		System.out.println("2 - @Test3");
	}

}
