package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends BasePage {
	private String titlePage = "PHPTRAVELS | Travel Technology Partner";
	private By imgLogo = By.xpath("//div[@class=\"header-logo go-right\"]");
	private By btnMyAccount = By.xpath("//div[contains(@class,'dropdown-login')]");
	private By linkLogin = By.xpath("//a[@href=\"https://www.phptravels.net/login\"]");
	private By linkSignUp = By.xpath("//a[@href=\"https://www.phptravels.net/register\"]");
	private By menu = By.xpath("//div[@class=\"menu-horizontal-wrapper-02\"]");
	private By optFlights = By.xpath("//ul//li//a[contains(text(),'Flights')]");
	private By optBoats = By.xpath("//ul//li//a[contains(text(),'Boats')]");
	private By optRentals = By.xpath("//ul//li//a[contains(text(),'Rentals')]");
	private By optTours = By.xpath("//ul//li//a[contains(text(),'Tours')]");
	private By optVisa = By.xpath("//ul//li//a[@class=\"text-center visa \"][contains(text(),'Visa')]");
	private By rbOneWay = By.xpath("//label[text()=\"One Way\"]");
	private By rbRoundTrip = By.xpath("//label[text()=\"Round Trip\"]");
	private By cmbTypeFlight = By.xpath("//div[@class=\"form-icon-left flightclass\"]//a[@class=\"chosen-single\"]");
	private By lblFrom = By.xpath("//div[@class=\"form-group\"]//label[text()=\"From\"]");
	private By lblTo = By.xpath("//div[@class=\"form-group\"]//label[text()=\"To\"]");
	private By lblDepart = By.xpath("//div[@class=\"form-group\"]//label[text()=\"Depart\"]");
	private By lblAdults = By.xpath("//div//label[text()=\"Adults \"]");
	private By lblChild = By.xpath("//div//label[text()=\"Child \"]");
	private By lblInfant = By.xpath("//div//label[text()=\"infant \"]");
	private By btnSearch = By.xpath("//button[contains(text(),'Search')]");
	private By inputFrom = By.xpath("//div[@id=\"s2id_location_from\"]//a[@class=\"select2-choice\"]");
	private By inputTo = By.xpath("//div[@id=\"s2id_location_to\"]");
	private By optBAAEP = By.xpath("//ul//li[1]//div[@class=\"select2-result-label\"]");
	private By optMAD = By.xpath("//ul[@class=\"select2-results\"]//li//*[contains(text(),'(MAD)')]");

	public Home(WebDriver driver) {
		super(driver);
	}

	public boolean homePageIsDisplayed() throws Exception {
		return this.getTitle().equals(titlePage);
	}
	
	public void clickOnBtnOneWay() throws Exception {
		this.scrollToElement(rbOneWay);
		this.click(rbOneWay);
	}
	
	public void enterFrom() throws Exception {
		this.click(inputFrom);
		this.sendKeys("BUENOS AIRES");
		this.click(optBAAEP);
	}
	
	public void clickOnBtnSearch() throws Exception {
		this.scrollToElement(btnSearch);
		this.click(btnSearch);
	}
	
	public void enterTo() throws Exception {
		this.click(inputTo);
		this.sendKeys("MADRID");
		this.click(optMAD);
	}

	public void validateMenuSearch() throws Exception {
		this.elementPresent(menu);
		this.elementPresent(optFlights);
		this.elementPresent(optBoats);
		this.elementPresent(optRentals);
		this.elementPresent(optTours);
		this.elementPresent(optVisa);
		this.elementPresent(rbOneWay);
		this.elementPresent(rbRoundTrip);
		this.elementPresent(cmbTypeFlight);
		this.elementPresent(lblFrom);
		this.elementPresent(lblTo);
		this.elementPresent(lblDepart);
		this.elementPresent(lblAdults);
		this.elementPresent(lblChild);
		this.elementPresent(lblInfant);
		this.elementPresent(btnSearch);
		this.elementPresent(inputFrom);
		this.elementPresent(inputTo);
	}
	
	public void validateElementsHome() throws Exception {
		this.elementPresent(imgLogo);
		this.elementPresent(btnMyAccount);
	}
	
	public void clickOptLinkLogin() throws Exception {
		this.click(linkLogin);
	}
	
	public void validateOptionsCmbAccount() throws Exception {
		this.elementPresent(linkLogin);
		this.elementPresent(linkSignUp);
	}

	public void clickOnBtnMyAccount() throws Exception {
		this.click(btnMyAccount);
	}

}
