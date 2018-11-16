package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant {
	public WebDriver driver;
    @BeforeMethod
	public void open() {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		String url = Property.getPropertydata(propertyfilepath, "url");
		driver.get(url);
	}

	@AfterMethod
	public void closeapp() {
		driver.close();
	}

}
