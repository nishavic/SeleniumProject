package objects;

import org.openqa.selenium.WebDriver;

import utility.Constant;

public class Homepage {
private static WebDriver wd;
	
	public static void setDriver(WebDriver wd) {
		Homepage.wd = wd;
	}

	public static void openPage() {
		if (wd==null)
			throw new RuntimeException("Driver is null! Need to call setDriver");
			wd.get(Constant.URL);
	}

	//Goes to the URL address that is the value of URL static attribute in Constant class
	public static void goToHomePage(WebDriver wd) {
		wd.get(Constant.URL); 
	}
}
