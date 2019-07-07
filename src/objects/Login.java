package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	// Methods for clicking on and sending keys to Username field
	public static void clickUserName(WebDriver wd) {
		GetElement.loginUser(wd).click();
	}

	public static void sendKeysUserName(WebDriver wd, String uName) {
		GetElement.loginUser(wd).sendKeys(uName);
	}
	// Methods for clicking on and sending keys to Password field
	public static void clickPassword(WebDriver wd) {
		GetElement.loginPassword(wd).click();
	}

	public static void sendKeysPassword(WebDriver wd, String uName) {
		GetElement.loginPassword(wd).sendKeys(uName);
	}

	// Method for clicking on Login button
	public static void clickLogInButton(WebDriver wd) {
		GetElement.logInButton(wd).click();
	}

	// Method for clicking on Logout button
	public static void clickLogoutButton(WebDriver wd) {
		GetElement.logOutButton(wd).click();
	}
}
