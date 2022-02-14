package first.webapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	// declare Selenium WebDriver
	private WebDriver webDriver;
	private final String BASE_URL="https://localhost:8090/maven-web-project";


	@BeforeTest
	public void beforeTest() {
		// Setting system properties of ChromeDriver
		// to amend directory path base on your local file path
		String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromeDriverDir);

		// initialize FirefoxDriver at the start of test
		webDriver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		// Quit the ChromeDriver and close all associated window at the end of test
		webDriver.quit();
	}

	@Test
	public void checkId() {
		// Load website as a new page
		webDriver.navigate().to(BASE_URL);
		System.out.println(webDriver.getTitle());

		Assert.assertEquals(webDriver.getTitle(), "Insert title here");
		//WebElement we = webDriver.findElement(By.id("content"));

		//System.out.println("id we: " + we.getAttribute("role"));
		//Assert.assertEquals(we.getAttribute("role"), "contentinfo");
	}

}
