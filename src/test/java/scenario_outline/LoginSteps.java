package scenario_outline;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private WebDriver driver;
	private LoginPage loginpage;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(1000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws Exception {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		Thread.sleep(1000);
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		loginpage.clickLoginBtn();
		Thread.sleep(1000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws Exception {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		loginpage.checkLogoutBtn();
	}
}
