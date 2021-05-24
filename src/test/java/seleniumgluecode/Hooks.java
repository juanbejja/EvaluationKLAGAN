package seleniumgluecode;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

	private static WebDriver driver;
	private DriverManager driverManager;

	@Before
	public void setUp() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		driver.get("https://www.phptravels.net/home");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driverManager.quitDriver();
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");

	}

	public static WebDriver getDriver() {
		return driver;
	}

}
