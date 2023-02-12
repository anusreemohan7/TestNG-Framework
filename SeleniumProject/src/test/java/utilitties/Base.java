package utilitties;

import org.openqa.selenium.WebDriver;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends PropertiesFile {

	public WebDriver intializeDriver() {
		getBrowerName();
		if (getBrowerName().equalsIgnoreCase("Chrome")) {
			WebDriver driver = WebDriverManager.chromedriver().create();
			return driver;
		} else if (getBrowerName().equalsIgnoreCase("firefox")) {
			WebDriver driver = WebDriverManager.firefoxdriver().create();

			return driver;

		} else if (getBrowerName().equalsIgnoreCase("safari")) {
			WebDriver driver = WebDriverManager.safaridriver().create();

			return driver;
		}

		return null;
	}
}
