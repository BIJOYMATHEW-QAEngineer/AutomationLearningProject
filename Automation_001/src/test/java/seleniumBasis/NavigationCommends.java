package seleniumBasis;

public class NavigationCommends extends Base {

	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {

		NavigationCommends nc = new NavigationCommends();
		nc.initialisebrowser();
		nc.navigationCommands();
	
		//	nc.closeBrowser();
	}

}
