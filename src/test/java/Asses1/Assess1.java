package Asses1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assess1 {

	WebDriver driver;

	public Assess1(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By btn_crtAnAcc = By.xpath("//*[@id=\"u_0_2_tb\"]");
	By txt_FirstName = By.xpath("//*[@id=\"u_2_b_y/\"]");
	By txt_SurName = By.xpath("//*[@id=\"u_2_d_Yw\"]");
	By txt_Mobile = By.xpath("//*[@id=\"u_2_g_TK\"]");
	By txt_Pass = By.xpath("//*[@id=\"password_step_input\"]");
	By drp_date = By.xpath("//*[@id=\"day\"]");
	By drp_mon = By.xpath("//*[@id=\"month\"]");
	By drp_year = By.xpath("//*[@id=\"year\"]");
	By gender = By.xpath("//*[@id=\"u_2_o_7q\"]/span[2]/label");
	By btn_signUp = By.xpath("//*[@id=\"u_2_s_gk\"]");

	public void clickCrtAnAcc() {
		driver.findElement(btn_crtAnAcc).click();
	}

	public void setFirstName(String firstName) {
		driver.findElement(txt_FirstName).sendKeys(firstName);
	}

	public void setsurName(String surName) {
		driver.findElement(txt_SurName).sendKeys(surName);
	}

	public void setMobile(String mobile) {
		driver.findElement(txt_Mobile).sendKeys(mobile);
	}

	public void setPass(String password) {
		driver.findElement(txt_Pass).sendKeys(password);
	}

	public void clickdob(String date, String month, String year) {
		Select selectDate = new Select(driver.findElement(drp_date));
		selectDate.selectByVisibleText(date);
		Select selectMonth = new Select(driver.findElement(drp_mon));
		selectMonth.selectByVisibleText(month);
		Select selectYear = new Select(driver.findElement(drp_year));
        selectYear.selectByVisibleText(year);
	}

	public void clickGender() {
		driver.findElement(gender).click();
	}

	public void clickSignUp() {
		driver.findElement(btn_signUp).click();
	}

}
