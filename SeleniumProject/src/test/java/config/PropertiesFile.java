package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static String getBrowerName() {
		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream("./src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			return browser;
		} catch (Exception e) {
			e.printStackTrace();
		}
//		String browser = "Chrome";
//		return browser;
		return null;
	}

}
