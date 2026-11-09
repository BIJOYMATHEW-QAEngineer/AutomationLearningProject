package seleniumBasis;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void verifyFileUploadByUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFileButton=driver.findElement(By.id("uploadfile_0"));
		chooseFileButton.sendKeys("C:\\workspace\\Automation_001\\src\\test\\resources\\file-Sample_PDF_1MB.pdf");
		WebElement checkBox=driver.findElement(By.id("terms"));
		checkBox.click();
		WebElement submitButton=driver.findElement(By.id("submitbutton"));
		submitButton.click();
	}
	
	public void verifyFileUploadByUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdf=driver.findElement(By.id("pickfiles"));
		selectPdf.click();
		StringSelection ss =new StringSelection("C:\\workspace\\Automation_001\\src\\test\\resources\\file-Sample_PDF_1MB.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r = new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		FileUpload fu=new FileUpload();
		fu.initialisebrowser();
		//fu.verifyFileUploadByUsingSendKeys();
		try {
			fu.verifyFileUploadByUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//fu.closeBrowser();
		
	}

}
