package seleniumBasis;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHandling extends Base{
	
	public void verifyRightClick()
	{
		WebElement rightClick=driver.findElement(By.id("others"));
		
		Actions actionRightClick=new Actions(driver);
		actionRightClick.contextClick(rightClick).build().perform();
	}
	
	public void verifyMouseOver()
	{
		WebElement mouseOver=driver.findElement(By.id("others"));
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(mouseOver).build().perform();
	}

	public void verifyDoubleClick()
	{
		WebElement doubleclick=driver.findElement(By.id("others"));
		Actions doubleclickmethod =new Actions(driver);
		doubleclickmethod.doubleClick(doubleclick).build().perform();
		
	}
	
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragItem=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement dropPlace=driver.findElement(By.id("mydropzone"));
		
		Actions ac =new Actions(driver);
		ac.dragAndDrop(dragItem, dropPlace).build().perform();
		
		
	}
	
	public void verifyKeyboardActions() throws AWTException
	{
		Robot ro =new Robot();//keyboard actions class 
		//open new Tab
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_T);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_T);
	}
	
	public static void main(String[] args) {
	
		ActionHandling ah = new ActionHandling();
		ah.initialisebrowser();
	//	ah.verifyRightClick();
		//ah.verifyMouseOver();
		//ah.verifyDoubleClick();
	//  ah.verifyDragAndDrop();
	  try {
		ah.verifyKeyboardActions();
	} catch (AWTException e) {
		
		e.printStackTrace();
	}
		
		//ah.closeBrowser();
	}

}
