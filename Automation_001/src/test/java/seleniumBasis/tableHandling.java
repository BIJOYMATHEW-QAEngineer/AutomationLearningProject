package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class tableHandling extends Base {

	public void verifyTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement fullTable = driver.findElement(By.id("dtBasicExample"));
		// System.out.println(fullTable.getText());

		WebElement fullRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]"));
		// System.out.println(fullRow.getText());
		WebElement selectRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		// System.out.println(selectRow.getText());
		WebElement selectSingleCell = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[2]"));
		System.out.println(selectSingleCell.getText());
	}

	public static void main(String[] args) {
		tableHandling th = new tableHandling();
		th.initialisebrowser();
		th.verifyTable();

		// th.closeBrowser();

	}

}
