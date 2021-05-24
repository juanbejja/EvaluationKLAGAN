package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search extends BasePage {
	private String titlePage = "Flights List";
	private By totalResults = By.xpath("//p[@class=\"text-muted post-heading\"]");
	private By headingSearch = By.xpath("//h3[@class=\"heading-title\"]");
	private By btnModifySearch = By.xpath("//button[text()=\"Modify Search\"]");
	private By divFilters = By.xpath("//div[@id=\"filterResultCallapseOnMobile\"]");

	public Search(WebDriver driver) {
		super(driver);
	}

	public boolean headingIsTrue() throws Exception {
		return this.getText(headingSearch).equals("AEP to MAD");
	}

	public void validateElements() throws Exception {
		this.elementPresent(totalResults);
		this.elementPresent(btnModifySearch);
		this.elementPresent(divFilters);
		this.elementPresent(headingSearch);
	}

	public boolean SearchPageIsDisplayed() throws Exception {
		return this.getTitle().equals(titlePage);
	}
}
