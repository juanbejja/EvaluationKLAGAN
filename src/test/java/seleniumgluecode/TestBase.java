package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import pom.Account;
import pom.Home;
import pom.Login;
import pom.Search;

public class TestBase {
	protected WebDriver driver = Hooks.getDriver();
	protected Home homepage = new Home(driver);
	protected Login loginpage = new Login(driver);
	protected Account account = new Account(driver);
	protected Search search = new Search(driver);
}
