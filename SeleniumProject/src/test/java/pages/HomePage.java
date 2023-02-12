package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[text()='Accept all']")
	WebElement acceptButton;

	@FindBy(xpath = "//button[contains(text(),' Sign in / Register ')]")
	WebElement signInButton;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailTextBox;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordTextBox;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueButton;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitButton;

	@FindBy(xpath = "//div[@id='button-basic']")
	WebElement profileIcon;

	public void acceptCookies() {

		acceptButton.click();// accepting cookies
	}

	public void signIn(String username, String password) {

		signInButton.click();
		emailTextBox.sendKeys(username);
		continueButton.click();
		passwordTextBox.sendKeys(password);
		submitButton.click();
	}

	public void verifyLogin(String username) {
		profileIcon.click();
		WebElement profileText = profileIcon.findElement(By.xpath("//*[contains(text(),'" + username + "')]"));
		Assert.assertTrue(profileText.isDisplayed());  // Validation
	}
}
