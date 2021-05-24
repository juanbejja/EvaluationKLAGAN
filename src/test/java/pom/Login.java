package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage {

	private final String EMAIL = "user@phptravels.com";
	private final String PASSWORD = "demouser";

	private String titlePage = "Login";
	private By header = By.xpath("//h3[text()=\"Login\"]");
	private By inputEmail = By.xpath("//form[@id=\"loginfrm\"]//input[@type=\"email\"]");
	private By inputPassword = By.xpath("//form[@id=\"loginfrm\"]//input[@type=\"password\"]");
	private By btnLogin = By.xpath("//form[@id=\"loginfrm\"]//button[@type=\"submit\"]");
	private By btnSignUp = By.xpath("//form[@id=\"loginfrm\"]//a[@href=\"https://www.phptravels.net/register\"]");
	private By btnForgetPass = By.xpath("//form[@id=\"loginfrm\"]//a[@href=\"#ForgetPassword\"]");
	private By lblRemember = By.xpath("//form[@id=\"loginfrm\"]//label[@for=\"remember-me\"]");

	public Login(WebDriver driver) {
		super(driver);
	}

	public void validateElements() throws Exception {
		this.elementPresent(header);
		this.elementPresent(inputEmail);
		this.elementPresent(inputPassword);
		this.elementPresent(btnLogin);
		this.elementPresent(btnSignUp);
		this.elementPresent(btnForgetPass);
		this.elementPresent(lblRemember);
	}

	public boolean LoginPageIsDisplayed() throws Exception {
		return this.getTitle().equals(titlePage);
	}

	public void enterEmail() throws Exception {
		this.sendKeys(inputEmail, EMAIL);
	}
	
	public void enterPassword() throws Exception {
		this.sendKeys(inputPassword, PASSWORD);
	}
	
	public void clickOnBtnLogin() throws Exception {
		this.click(btnLogin);
	}

}
