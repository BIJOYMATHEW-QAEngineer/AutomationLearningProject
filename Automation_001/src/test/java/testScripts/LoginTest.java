package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import demoProject.Base;
import pages.LoginPage;
import utilities.ExcelUtiles;

public class LoginTest extends Base {

	@Test

	public void verifyUserLoginWithValidCredentials() throws IOException {
		LoginPage lp = new LoginPage(driver);
		String uName = ExcelUtiles.readStringData(0, 0, "loginData");
		String pPassword = ExcelUtiles.readStringData(0, 1, "loginData");
		lp.enterUserName(uName);
		lp.enterUserPassword(pPassword);
		lp.loginButton();
	}

	@Test

	public void verifyUserLoginWithInvalidCredentials() throws IOException {

		LoginPage lp = new LoginPage(driver);
		String uName = ExcelUtiles.readStringData(1, 0, "loginData");
		String pPassword = ExcelUtiles.readStringData(1, 1, "loginData");
		lp.enterUserName(uName);
		lp.enterUserPassword(pPassword);
		lp.loginButton();
	}

	@Test
	public void verifyUserLoginWIthValidUserName() throws IOException {

		LoginPage lp = new LoginPage(driver);
		String uName = ExcelUtiles.readStringData(2, 0, "loginData");
		String pPassword = ExcelUtiles.readStringData(2, 1, "loginData");
		lp.enterUserName(uName);
		lp.enterUserPassword(pPassword);
		lp.loginButton();

	}

	@Test
	public void verifyUserLoginWithValidPassword() throws IOException {

		LoginPage lp = new LoginPage(driver);
		String uName = ExcelUtiles.readStringData(3, 0, "loginData");
		String pPassword = ExcelUtiles.readStringData(3, 1, "loginData");
		lp.enterUserName(uName);
		lp.enterUserPassword(pPassword);
		lp.loginButton();
	}
}
