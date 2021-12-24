package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By email=By.xpath("/html/body/div[7]/div/div/div[2]/form/div/div[1]/input");
	By password=By.xpath("/html/body/div[7]/div/div/div[2]/form/div/div[2]/input");
	By login=By.xpath("/html/body/div[7]/div/div/div[2]/form/div/div[3]/button");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	
	}
	
	

	public WebElement getemail() {
		return driver.findElement(email);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getlogin() {
		return driver.findElement(login);
	}

}
