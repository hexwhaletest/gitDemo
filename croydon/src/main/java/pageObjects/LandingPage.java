package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By signin = By.xpath("//*[@id=\"profileMenu\"]");
	By title=By.xpath("html/body/div[4]/div[2]/div/div/div[1]/div/div[2]");
	By navigationbar=By.xpath("/html/body/header/div[3]/ul");
	By buy=By.xpath("//*[@id='933']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getlogin() {
		return driver.findElement(signin);
	}
	public WebElement gettitle() {
		return driver.findElement(title);
	}
	public WebElement getnavigationbar() {
		return driver.findElement(navigationbar);
		
	}
	public WebElement getbuy() {
		return driver.findElement(buy);
	}
}
