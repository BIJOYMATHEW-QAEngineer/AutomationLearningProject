package seleniumBasis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());

		WebElement frameOne = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameOne);
		WebElement sampleText = driver.findElement(By.id("sampleHeading"));
		System.out.println(sampleText.getText());
		driver.switchTo().defaultContent();

	}

	public static void main(String[] args) {
		HandlingFrames hF = new HandlingFrames();
		hF.initialisebrowser();
		hF.verifyFrames();
		// hF.closeBrowser();

	}

}
