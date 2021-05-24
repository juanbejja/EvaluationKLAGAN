package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By element) throws Exception {
		try {

			elementClickable(element);
			driver.findElement(element).click();

		} catch (Exception e) {
			throw new Exception("The element could not be clicked on: " + element);
		}
	}

	public void sendKeys(By element, String value) throws Exception {
		try {
			driver.findElement(element).sendKeys(value);
		} catch (Exception e) {
			throw new Exception("Unable to send keys on the element: " + element);
		}
	}

	public void sendKeys(String value) throws Exception {
		driver.findElement(By.xpath("//body")).sendKeys(value);
	}

	public boolean isDisplay(By element) throws Exception {
		try {
			return driver.findElement(element).isDisplayed();
		} catch (Exception e) {
			throw new Exception("item is not displayed: " + element);
		}
	}

	public void elementClickable(By elemento) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void scrollToElement(By elemento) {
		WebElement element = driver.findElement(elemento);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void elementPresent(By elemento) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public String getText(By element) throws Exception {
		try {
			return driver.findElement(element).getText();
		} catch (Exception e) {
			throw new Exception("The text could not be taken from the element: " + element);
		}
	}

	public String getTitle() throws Exception {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			throw new Exception("Unable to obtain the page title");
		}
	}

}
