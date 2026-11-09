package seleniumBasis;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {

	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleClick = driver.findElement(By.id("alertButton"));
		simpleClick.click();

		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmClick = driver.findElement(By.id("confirmButton"));
		confirmClick.click();
		Alert al = driver.switchTo().alert();
		al.dismiss();
		// al.accept();
		WebElement alertMessage = driver.findElement(By.id("confirmResult"));
		System.out.println(alertMessage.getText());
	}

	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert=driver.findElement(By.id("promtButton"));
		promptAlert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Test prompt alert ");
		al.accept();
	}
	
	public static void main(String[] args) {
		AlertHandling ah = new AlertHandling();
		ah.initialisebrowser();
		// ah.verifySimpleAlert();
		//ah.verifyConfirmAlert();
		ah.verifyPromptAlert();
		// ah.closeBrowser();
	}

}
