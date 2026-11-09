package seleniumBasis;

public class BrowserCommends extends Base {

	public void verifyCommends()
	{
		String title = driver.getTitle();
		System.out.println(title);
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String handleID= driver.getWindowHandle();
		System.out.println(handleID);
		
		String source =driver.getPageSource();
		System.out.println(source);
		
	}
	
	public static void main(String[] args) {

		BrowserCommends bc = new BrowserCommends();
		bc.initialisebrowser();
		bc.verifyCommends();
		bc.closeBrowser();

	}

}
