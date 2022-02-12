package Asses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePage {
	WebDriver driver;

	public OrangePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUsername")
	WebElement txt_Username;

	@FindBy(id = "txtPassword")
	WebElement txt_Password;

	@FindBy(id = "btnLogin")
	WebElement btn_Login;

	public void setUsername(String username) {
		txt_Username.sendKeys(username);
	}

	public void setPassword(String password) {
		txt_Password.sendKeys(password);
	}

	public void clickLogin() {
		btn_Login.click();
	}

}
