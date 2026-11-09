package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webElementCommands extends Base{
	
	public void verifyWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement textField=driver.findElement(By.id("single-input-field"));
		textField.sendKeys("Check message");
		
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		System.out.println(showMessageButton.isDisplayed());
		System.out.println(showMessageButton.isEnabled());
		showMessageButton.click();
		
		WebElement displayMessage =driver.findElement(By.id("message-one"));
		System.out.println(displayMessage.getText());
		
		System.out.println(displayMessage.getTagName());
		System.out.println(showMessageButton.getCssValue("background-color"));
		
		textField.clear();
		
	}

	public static void main(String[] args) {
		webElementCommands wc = new webElementCommands();
		wc.initialisebrowser();
		wc.verifyWebElementCommands();
		
		//wc.closeBrowser();

	}

}
