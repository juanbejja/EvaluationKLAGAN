package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account extends BasePage {
	
	private String titlePage = "My Account";
	private By txtBtnAccount = By.xpath("//a[@id=\"dropdownCurrency\"][contains(.,'Demo')]");
	private By headerAccount = By.xpath("//h3[text()=\"Hi, Demo User\"]");
	private By imgUser = By.xpath("//img[@src=\"https://www.phptravels.net/uploads/global/default/user.png\"]");
	private By linkHome = By.xpath("//a[@title=\"home\"]");
	private By linkVisa = By.xpath("//div[@id=\"mobileMenuMain\"]//*[contains(text(),'Visa')]");
	private By linkCompany = By.xpath("//div[@id=\"mobileMenuMain\"]//a[contains(text(),'company')]");
	private By linkOurPartners = By.xpath("//div[@id=\"mobileMenuMain\"]//a[contains(text(),'Our Partners')]");

	public Account(WebDriver driver) {
		super(driver);
	}
	
	public void validateElements() throws Exception {
		this.elementPresent(txtBtnAccount);
		this.elementPresent(headerAccount);
		this.elementPresent(imgUser);
		this.elementPresent(linkHome);
		this.elementPresent(linkVisa);
		this.elementPresent(linkCompany);
		this.elementPresent(linkOurPartners);
	}
	
	public void clickOnLinkHome() throws Exception {
		this.click(linkHome);
	}
	
	public boolean AccountPageIsDisplayed() throws Exception {
		return this.getTitle().equals(titlePage);
		
	}
}
