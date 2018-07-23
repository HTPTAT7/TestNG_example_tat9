package by.htp.tstng.simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTestExample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("1 - @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("1 - @AfterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("1 - @BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("1 - @AfterTest");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("1 - @BeforeGroups");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("1 - @AfterGroups");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("1 - @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("1 - @AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("1 - @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("1 - @AfterMethod");
	}

	@Parameters({"login", "pass"})
	@Test(groups = {"chrome.login", "firefox.login"})
	public void testSmth1(String l, String p) {
		System.out.println("1 - @Test1");
		System.out.println("Params: " + l + ", " +p);
	}
	@Parameters({"login", "pass"})
	@Test(groups = {"chrome.login", "firefox.login"})
	public void testSmth2(String l, String p) {
		System.out.println("1 - @Test2");
		System.out.println("Params: " + l + ", " +p);
	}
	@Test(groups = {"chrome.logout", "firefox.logout"})
	public void testSmth3() {
		System.out.println("1 - @Test3");
	}
	
	@Parameters({"xVal"})
	@Test(groups = {"chrome.login", "firefox.login"})
	public void testSmth(@Optional("5") int x) {
		System.out.println("xVal=" + x++);
	}
	
	

}
