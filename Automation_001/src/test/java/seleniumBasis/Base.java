package seleniumBasis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	
	public void initialisebrowser()
	{
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("https://selenium.qabible.in");
		driver.manage().window().maximize();
		
	}
	
	public void closeBrowser()
	{
		//driver.close();
		driver.quit();
	}
	
	
	public static void main(String[] args) {
	
		Base b = new Base();
		b.initialisebrowser();
		b.closeBrowser();

	}

}
