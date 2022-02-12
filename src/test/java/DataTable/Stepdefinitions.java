package DataTable;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Stepdefinitions extends BaseClass {
	
	OrangePage orangepage;

	@Given("user opens the browser")
	public void user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user opens the url {string}")
	public void user_opens_the_url(String string) {
		driver.get(string);
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password(DataTable datatable) throws InterruptedException {
		orangepage = new OrangePage(driver);
		List<Map<String, String>> credentials = datatable.asMaps(String.class, String.class);
		System.out.println(credentials);
		orangepage.setUsername(credentials.get(0).get("username"));
		orangepage.setPassword(credentials.get(0).get("password"));
	}

	@When("click on login")
	public void click_on_login() {
		orangepage.clickLogin();
	}

	@Then("user should get the welcomepage")
	public void user_should_get_the_welcomepage() {
		String welcome = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(welcome.contains(welcome), true, "welcome page not loaded");
	}

	@When("user click on logout")
	public void user_click_on_logout() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

	@Then("user should get the login panel")
	public void user_should_get_the_login_panel() {
		String loginPanel = driver.findElement(By.id("logInPanelHeading")).getText();
		Assert.assertEquals(loginPanel, "LOGIN Panel", "Login panel not loaded");
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
}
