package simpleMain;

import org.testng.annotations.Test;

public class TestMain1Test {

	@Test
	public void main1Test() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}
}