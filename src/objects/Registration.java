package objects;

import org.openqa.selenium.WebDriver;

public class Registration {
	//Methods for clicking on and sending keys to First name field
	public static void clickFirstName(WebDriver wd) {
		GetElement.firstName(wd).click();
	}

	public static void sendKeysFirstName(WebDriver wd, String i) {
		GetElement.firstName(wd).sendKeys(i);
	}

	// Methods for clicking on and sending keys to Last name field
	public static void clickLastName(WebDriver wd) {
		GetElement.lastName(wd).click();
	}

	public static void sendKeysLastName(WebDriver wd, String i) {
		GetElement.lastName(wd).sendKeys(i);
	}

	// Methods for clicking on and sending keys to Username field
	public static void clickuserName(WebDriver wd) {
		GetElement.userName(wd).click();
	}

	public static void sendKeysUserName(WebDriver wd, String i) {
		GetElement.userName(wd).sendKeys(i);
	}

	// Methods for clicking on and sending keys to Email field
	public static void clickemail(WebDriver wd) {
		GetElement.email(wd).click();
	}

	public static void sendKeysEmail(WebDriver wd, String i) {
		GetElement.email(wd).sendKeys(i);
	}
	
	// Methods for clicking on and sending keys to Password field
	public static void clickPassword(WebDriver wd) {
		GetElement.password(wd).click();
	}

	public static void sendKeysPassword(WebDriver wd, String i) {
		GetElement.password(wd).sendKeys(i);
	}
		
	// Method for clicking on Register button
	public static void clickRegButton(WebDriver wd) {
		GetElement.registrationBtn(wd).click();
	}
}
