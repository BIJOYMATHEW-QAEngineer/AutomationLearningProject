package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogoutScenario extends Base{

	public void verifyLogoutSucessful()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("admin");
		WebElement userPass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		userPass.sendKeys("admin");
		WebElement signIn =driver.findElement(By.xpath("//button[@type='submit']"));
		signIn.click();
		WebElement adminlink=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		adminlink.click();
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		
		
	}
	
	
	public static void main(String[] args) {
		
		LogoutScenario test=new LogoutScenario();
		test.initialisebrowser();
		test.verifyLogoutSucessful();
	}

}
