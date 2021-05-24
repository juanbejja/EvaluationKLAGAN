package seleniumgluecode;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test extends TestBase {

	@Given("^User is on the home screen$")
	public void user_is_on_the_home_screen() throws Throwable {
		account.validateElements();
		Assert.assertTrue(account.AccountPageIsDisplayed());
		account.clickOnLinkHome();
		homepage.validateElementsHome();
		Assert.assertTrue(homepage.homePageIsDisplayed());
		homepage.validateMenuSearch();
	}

	@When("^Enter the search for a one-way flight from Argentina to Madrid$")
	public void enter_the_search_for_a_one_way_flight_from_Argentina_to_Madrid() throws Throwable {
		homepage.clickOnBtnOneWay();
		homepage.enterFrom();
		homepage.enterTo();
		homepage.clickOnBtnSearch();
	}

	@Then("^You will be redirected to the flight search screen$")
	public void you_will_be_redirected_to_the_flight_search_screen() throws Throwable {
		search.validateElements();
		Assert.assertTrue(search.SearchPageIsDisplayed());
		Assert.assertTrue(search.headingIsTrue());
	}

	@Given("I am logged in phptravels")
	public void i_am_logged_in_phptravels() throws Exception {
		Assert.assertTrue(homepage.homePageIsDisplayed());
		homepage.validateElementsHome();
		homepage.clickOnBtnMyAccount();
		homepage.validateOptionsCmbAccount();
		homepage.clickOptLinkLogin();
		Assert.assertTrue(loginpage.LoginPageIsDisplayed());
		loginpage.validateElements();
		loginpage.enterEmail();
		loginpage.enterPassword();
		loginpage.clickOnBtnLogin();
	}

}
