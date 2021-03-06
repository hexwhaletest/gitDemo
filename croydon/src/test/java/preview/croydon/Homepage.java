package preview.croydon;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class Homepage extends Base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		//driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String password, String text) throws IOException {
		//public void initialize() throws IOException {
			//driver = initializeDriver();
			driver.get(prop.getProperty("url"));
		

		LandingPage l = new LandingPage(driver);
		l.getlogin().click();

		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(password);
		System.out.println(text);
		lp.getlogin().click();

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "sumesh@hexwhale.com";
		data[0][1] = "123456789";
		data[0][2] = "Restricted user";

		data[1][0] = "sumesh@hexwhale.com";
		data[1][1] = "12345678";
		data[1][2] = "valid user";
		return data;

	}

}
