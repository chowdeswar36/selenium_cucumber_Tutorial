package scenario_outline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//*[@id='name']")
	WebElement txt_username;
	@FindBy(xpath = "//*[@id='password']")
	WebElement txt_password;
	@FindBy(xpath = "//*[@id='login']")
	WebElement btn_login;
	@FindBy(xpath = "//*[@id='logout']")
	WebElement btn_logout;
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
        txt_password.sendKeys(password);
	}
	public void clickLoginBtn() {
         btn_login.click();
	}
	public void checkLogoutBtn() throws Exception {
		if(btn_logout.isDisplayed()) {
			driver.close();
		} else {
			throw new Exception("logout button is not visible");
		}
	}
}
