package seleniumBasis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	
	public void verifyMultipleWindows()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowID=driver.getWindowHandle();
		WebElement firstClick=driver.findElement(By.xpath("//a[text()='Click Here']"));
		firstClick.click();
		Set<String> handleIDS=driver.getWindowHandles();
		//Iterator<String>it=handleIDS.iterator();
	/*	while(it.hasNext())
		{
			String secondWindowID=it.next();
			if(!secondWindowID.equals(firstWindowID))
			{
				driver.switchTo().window(secondWindowID);
				WebElement emailID=driver.findElement(By.name("emailid"));
				emailID.sendKeys("Test@test.in");
				WebElement submit=driver.findElement(By.name("btnLogin"));
				submit.click();
			}
		}*/
		for(String secondWindowID : handleIDS)
		{
		    if(!secondWindowID.equals(firstWindowID))
		    {
		        driver.switchTo().window(secondWindowID);

		        WebElement emailID = driver.findElement(By.name("emailid"));
		        emailID.sendKeys("Test@test.in");

		        WebElement submit = driver.findElement(By.name("btnLogin"));
		        submit.click();
		    }
		}
		
		
		}

	public static void main(String[] args) {
		MultipleWindowHandling mw = new MultipleWindowHandling();
		mw.initialisebrowser();
		mw.verifyMultipleWindows();
		
		//mw.closeBrowser();

	}

}
