package Asses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	private WebDriver driver;
	Assess1 a1;
	OrangePage orangepage;

//	@Given("user opens the browser")
//	public void user_opens_the_browser() {
//		System.setProperty("webdriver.chrome.driver",
//				"Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@When("user opens the url {string}")
//	public void user_opens_the_url(String qaUrl) {
//		driver.get(qaUrl);
//
//	}
//
//	@Then("the page title should be {string}")
//	public void the_page_title_should_be(String title) {
//		String actUrl = driver.getTitle();
//		Assert.assertEquals(title, actUrl);
//	}
//
//	@When("user navigate to {string}")
//	public void user_navigate_to(String fbUrl) {
//		driver.navigate().to(fbUrl);
//	}
//
//	@When("user navigate to back url")
//	public void user_navigate_to_back_url() {
//		driver.navigate().back();
//	}
//
//	@Then("user prints the title of the page")
//	public void user_prints_the_title_of_the_page() {
//		String actUrl = driver.getTitle();
//		System.out.println("Title of the page is " + actUrl);
//	}
//
//	@Then("user navigate to forward and refresh the page")
//	public void user_navigate_to_forward_and_refresh_the_page() {
//		driver.navigate().forward();
//		driver.navigate().refresh();
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//		driver.close();
//	}

	///////////// Assessement 2//

//	@Given("user opens the browser")
//	public void user_opens_the_browser() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\chowd\\eclipse-workspace\\selenium_cucumber_QA\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@When("user opens the url {string}")
//	public void user_opens_the_url(String url) {
//		driver.get(url);
//	}
//
//	@Then("the page url should be {string}")
//	public void the_page_title_should_be(String expurl) {
//		String act_url = driver.getCurrentUrl();
//		System.out.println(act_url + "-----------" + expurl);
//		Assert.assertEquals(expurl, act_url);
//		driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[8]/a")).click();
//	}
//
//	@Then("user check the {string} on the page and click")
//	public void user_check_the_on_the_page(String exp_crtAnAcc) {
//		String act_crtAnAcc = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"))
//				.getText();
//		System.out.println(act_crtAnAcc + "---------" + exp_crtAnAcc);
//		Assert.assertEquals(exp_crtAnAcc, act_crtAnAcc);
//		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
//	}
//
//	@When("user enter all the required details")
//	public void user_enter_all_the_required_details() {
//		a1 = new Assess1(driver);
//		driver.findElement(By.id("id=\"u_2_b_y/\"")).sendKeys("kanna");
//		a1.setFirstName("xyz");
//		a1.setsurName("abc");
//		a1.setMobile("1234567890");
//		a1.setPass("123456");
//		a1.clickdob("14", "July", "1999");
//		a1.clickGender();
//
//	}
//
//	@When("user clicks on the Create an account button")
//	public void user_clicks_on_the_Create_an_account_button() {
//		a1.clickCrtAnAcc();
//	}
//
//	@Then("user verify the account is created or not")
//	public void user_verify_the_account_is_created_or_not() {
//
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//		driver.close();
//	}

	//// Assessement 3//////////////////////////////////////

	// List<WebElement> links;
//	@Given("user opens the browser")
//	public void user_opens_the_browser() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\chowd\\eclipse-workspace\\selenium_cucumber_QA\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@When("user opens the url {string}")
//	public void user_opens_the_url(String string) {
//	   driver.get(string);
//	}
//
//	@Then("user finds the number of links in home page")
//	public void user_finds_the_number_of_links_in_home_page() {
//	    links=driver.findElements(By.tagName("a"));  
//	    System.out.println(links.size());
//	}
//
//	@Then("user prints linktext and url of the each link")
//	public void user_prints_linktext_and_url_of_the_each_link() {
//	    for(WebElement i:links) {
//	    	System.out.println(i.getText()+"------"+i.getAttribute("href"));
//	    }
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//	   driver.close();
//	}

	///////////////////////// Assessement 4////////////////////////////////////
//
//	List<WebElement> products;
//	Scanner sc;
//
//	@Given("user opens the browser based on your selection")
//	public void user_opens_the_browser_based_on_your_selection() {
//		System.out.println("Select Your Browser :");
//		System.out.println("1.Chrome:");
//		System.out.println("2.Edge");
//		sc = new Scanner(System.in);
//		System.out.println("Enter your option: ");
//		int n = sc.nextInt();
//		switch (n) {
//		case 1:
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\chowd\\eclipse-workspace\\selenium_cucumber_QA\\Drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			break;
//		case 2:
//			System.setProperty("webdriver.edge.driver",
//					"C:\\Users\\chowd\\eclipse-workspace\\selenium_cucumber_Assesessment\\Drivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//			driver.manage().window().maximize();
//			break;
//		}
//	}
//
//	@When("user opens the url {string}")
//	public void user_opens_the_url(String url) {
//		driver.get(url);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//	}
//
//	@When("user searches {string} on home page and click search")
//	public void user_searches_on_home_page(String value) {
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"))
//				.sendKeys(value);
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
//	}
//
//	@When("user select internal storage dropdown as {int} GB & Above")
//	public void user_select_internal_storage_dropdown_as_GB_Above(Integer int1) throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(text(),'Internal Storage')]")).click();
//		driver.findElement(By.xpath(
//				"//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[7]/div[2]/div/div[1]/div/label/div[2]"))
//				.click();
//		Thread.sleep(3000);
//	}
//
//	@Then("user prints the total products")
//	public void user_prints_the_total_products() {
//		products = driver.findElements(
//				By.xpath("//div[@class=\"_1AtVbE col-12-12\"]//div[@class=\"_13oc-S\"]//div[@class=\"_4rR01T\"]"));
//		System.out.println(products.size());
//	}
//
//	@Then("user prints each product name and product link")
//	public void user_prints_each_product_name_and_product_link() {
//
//		for (int i = 1; i <= products.size(); i++) {
//			WebElement product = driver
//					.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div[@class='_1AtVbE col-12-12'][" + i
//							+ "]//a//div[@class='_4rR01T']"));
//			System.out.println(i + " product name :" + product.getText());
//		}
//
//		for (int i = 1; i <= products.size(); i++) {
//			WebElement product = driver.findElement(
//					By.xpath("//div[@class=\"_1YokD2 _3Mn1Gg\"]/div[@class=\"_1AtVbE col-12-12\"][" + i + "]//a"));
//			System.out.println(i + " product link :" + product.getAttribute("href"));
//		}
//	}
//
//	@Then("user prints the required nth product {int}")
//	public void user_prints_the_required_nth_product(int n) {
////		System.out.println("Enter your nth product :");
////		int n = sc.nextInt();
//		WebElement productText = driver
//				.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div[@class='_1AtVbE col-12-12'][" + n
//						+ "]//a//div[@class='_4rR01T']"));
//		WebElement productLink = driver.findElement(
//				By.xpath("//div[@class=\"_1YokD2 _3Mn1Gg\"]/div[@class=\"_1AtVbE col-12-12\"][" + n + "]//a"));
//		System.out.println(productText.getText() + "------------" + productLink.getAttribute("href"));
//		driver.close();
//	}

	//////////////// Assessment 5//////////
	// Scanner sc;

//	@Given("user opens the browser based on your selection")
//	public void user_opens_the_browser_based_on_your_selection() {
//		System.setProperty("webdriver.chrome.driver",
//				"Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		System.out.println("Select Your Browser :");
//		System.out.println("1.Chrome:");
//		System.out.println("2.Edge");
//		sc = new Scanner(System.in);
//		System.out.println("Enter your option: ");
//		int n = sc.nextInt();
//		switch (n) {
//		case 1:
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\chowd\\eclipse-workspace\\selenium_cucumber_QA\\Drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			break;
//		case 2:
//			System.setProperty("webdriver.edge.driver",
//					"C:\\Users\\chowd\\eclipse-workspace\\selenium_cucumber_Assesessment\\Drivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//			driver.manage().window().maximize();
//			break;
//		}
//	}
//
//	@When("user opens the url {string}")
//	public void user_opens_the_url(String url) {
//		driver.get(url);
//	}
//
//	@When("user enters the login credentials and click on login")
//	public void user_enters_the_login_credentials_and_click_on_login() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8121335076");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("dcr@8121");
//		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
//		Actions act = new Actions(driver);
//		act.click(login).build().perform();
//	}
//
//	@Then("user should get the page title {string}")
//	public void user_should_get_the_page_title(String exp_title) throws InterruptedException {
//		Thread.sleep(2000);
//		String act_title = driver.getTitle();
//		System.out.println(exp_title + "------" + act_title);
//		Assert.assertEquals(exp_title, act_title);
//
//	}
//
//	@When("user clicks logout button")
//	public void user_clicks_logout_button() throws AWTException, InterruptedException {
//		Thread.sleep(2000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@aria-label=\"Account\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class=\"qzhwtbm6 knvmm38d\"]//span[contains(text(),'Log Out')]")).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("user should get {string}")
//	public void user_should_get(String exp_content) {
//		String act_content = driver.findElement(By.xpath("//div[@class=\"_1gaz _1ga- _50f6\"]")).getText();
//		Assert.assertEquals(exp_content, act_content);
//
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//		driver.close();
//	}

	// Assessment 6
//	@Given("user opens the browser")
//	public void user_opens_the_browser() {
//		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@When("user opens the url {string}")
//	public void user_opens_the_url(String string) {
//		driver.get(string);
//	}
//
//	@When("user enters the username and password")
//	public void user_enters_the_username_and_password(DataTable datatable) throws InterruptedException {
//		orangepage = new OrangePage(driver);
//		List<Map<String, String>> credentials = datatable.asMaps(String.class, String.class);
//		System.out.println(credentials);
//		orangepage.setUsername(credentials.get(0).get("username"));
//		orangepage.setPassword(credentials.get(0).get("password"));
//	}
//
//	@When("click on login")
//	public void click_on_login() {
//		orangepage.clickLogin();
//	}
//
//	@Then("user should get the welcomepage")
//	public void user_should_get_the_welcomepage() {
//		String welcome = driver.findElement(By.id("welcome")).getText();
//		Assert.assertEquals(welcome.contains(welcome), true, "welcome page not loaded");
//	}
//
//	@When("user click on logout")
//	public void user_click_on_logout() throws InterruptedException {
//		driver.findElement(By.id("welcome")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
//	}
//
//	@Then("user should get the login panel")
//	public void user_should_get_the_login_panel() {
//		String loginPanel = driver.findElement(By.id("logInPanelHeading")).getText();
//		Assert.assertEquals(loginPanel, "LOGIN Panel", "Login panel not loaded");
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//		driver.quit();
//	}

}
