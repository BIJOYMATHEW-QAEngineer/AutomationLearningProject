package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(id="user-name")WebElement userName;
@FindBy(id="password")WebElement password;
@FindBy(id="login-button")WebElement loginButton;


public void enterUserName(String uName)
{
	userName.sendKeys(uName);
}

public void enterUserPassword(String pPassword)
{
	password.sendKeys(pPassword);
}

public void loginButton()
{
	loginButton.click();
}

}
