package seleniumBasis;

import org.openqa.selenium.By;

public class Locators extends Base {

	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");

		// locators

		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));

		// cssselector: tagname[attribute ='attribute value']

		driver.findElement(By.cssSelector("button[id='button-one']"));

		// xpath
		/*
		 * 1. absoulte xpath -
		 * /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button --->()full
		 * xpath from the inspect ) 2.relative xpath --
		 * //tagname[@attribute='attributevalue']
		 */
		driver.findElement(By.xpath("//button[@id='button-two']"));

		// xpath features
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));

		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));

		driver.findElement(By.xpath("//button[text() ='Show Message']"));

		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));

		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));

		// xpath access methods

		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));

		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));

		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));

		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}

	public static void main(String[] args) {
		Locators lo = new Locators();
		lo.initialisebrowser();
		lo.verifyLocators();
		// l.closeBrowser();

	}

}
