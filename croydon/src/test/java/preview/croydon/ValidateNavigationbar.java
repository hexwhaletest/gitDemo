package preview.croydon;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;
//adding logs
//generating html
// screnshoot

public class ValidateNavigationbar extends Base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void basePageNaavigation() throws IOException {
		
		LandingPage l = new LandingPage(driver);
		// l.getnavigationbar().isDisplayed();
		Assert.assertTrue(l.getnavigationbar().isDisplayed());
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
