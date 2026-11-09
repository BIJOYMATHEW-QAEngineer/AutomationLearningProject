package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandles extends Base {

	public void verifDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement dropDownOne = driver.findElement(By.id("dropdowm-menu-1"));

		Select sc1 = new Select(dropDownOne);
		// sc1.selectByIndex(2);
		// sc1.selectByValue("c#");
		//sc1.selectByVisibleText("SQL");

	}

	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-2']"));
		WebElement checkBox = driver.findElement(By.xpath("//label[text()='Option 2']"));
		checkBox.click();
	}
	
	public void verifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//WebElement radioButton=driver.findElement(By.xpath("//input[@name='color' and @value='blue']"));
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='purple']"));
		
		radioButton.click();
		System.out.println(radioButton.isSelected());
		
	}

	public void selectAndDisiableButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	
		
		WebElement sDButton=driver.findElement(By.xpath("//input[@value='lettuce']"));
		sDButton.click();
		
		WebElement fruiteSelect=driver.findElement(By.id("fruit-selects"));
		Select sc2=new Select(fruiteSelect);
		sc2.selectByVisibleText("Apple");
		
		
	}
	
	
	public static void main(String[] args) {
		DropDownHandles dh = new DropDownHandles();
		dh.initialisebrowser();
		dh.verifDropdown();
		dh.verifyCheckBox();
		dh.verifyRadioButton();
		//dh.selectAndDisiableButton();
		// dh.closeBrowser();

	}

}
