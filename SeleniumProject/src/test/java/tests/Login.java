package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilitties.*;

public class Login extends Base {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = intializeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "test1data")
	public void loginTest(String username, String password) {

		driver.get("https://www.efinancialcareers.com/");
		HomePage hm = new HomePage(driver);
		hm.acceptCookies();
		hm.signIn(username, password);
		hm.verifyLogin(username);

	}

	ExcelDataProvider ex = new ExcelDataProvider();

	@DataProvider(name = "test1data")
	public Object[][] getCredentials() throws IOException {
		Object logInData[][] = ex.testData("./test data/loginData.xlsx", "Sheet1");
		return logInData;
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}
}
