package by.htp.tstng.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.htp.entity.Letter;

public class TestDataProviderExample {

	@DataProvider(name = "collectionData")
	public Iterator<String> collectionTestData() {

		List<String> data = new ArrayList<>();
		data.add("user1");
		data.add("user2");
		data.add("user3");
		return data.iterator();
	}

	@DataProvider(name = "arrayData")
	public Object[][] arrayTestData() {

		Object[][] data = new Object[][] { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" }, };
		return data;
	}

	@Test(dataProvider = "arrayData", enabled = false)
	public void doSmth(String login, String pass) {
		System.out.println("login " + login + ", " + "pass " + pass);
	}

	@Test(dataProvider = "collectionData", enabled=false)
	public void doSmth2(String login) {
		System.out.println("login " + login);
	}

	@DataProvider(name = "letters")
	public Iterator<Letter> letterTestData() {
		List<Letter> data = new ArrayList<>();
		data.add(new Letter("1@mail.ru", "1", "11111"));
		data.add(new Letter("2@mail.ru", "2", "22222"));
		data.add(new Letter("3@mail.ru", "3", "33333"));
		return data.iterator();
	}
	
	private Letter expected;
	
	@BeforeMethod
	public void initSendLetterExpectedData() {
		expected = new Letter("1@mail.ru", "1", "11111");
	}
	
	@Test(dataProvider="letters")
	public void testSendLetter(Letter actual) {
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}

}
