package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {
	// Method for clicking on Make a post button
	public static void clickMakePost(WebDriver wd) {
		GetElement.makePost(wd).click();
	}

	// Methods for clicking on and sending keys to Naziv field
	public static void clickNaziv(WebDriver wd) {
		GetElement.naziv(wd).click();
	}

	public static void sendKeysAddName(WebDriver wd, String uName) {
		GetElement.naziv(wd).sendKeys(uName);
	}

	// Methods for clicking on and sending keys to Lokacija field
	
	public static void clickLokacija(WebDriver wd) {
		GetElement.lokacija(wd).click();
	}

	public static void sendKeysLokacija(WebDriver wd, String uName) {
		GetElement.lokacija(wd).sendKeys(uName);
	}

	// Method for uploading a picture
	public static void sendKeysPicture(WebDriver wd, String picPath) {
		GetElement.addPicture(wd).sendKeys(picPath);
	}

	// Method for selecting a mode of transportation
	public static void selectTransport(WebDriver wd, String mode) {
		GetElement.addTransport(wd).selectByVisibleText(mode);
	}

	// Methods for adding a post body
	public static void clickText(WebDriver wd) {
		GetElement.addText(wd).click();
	}

	public static void sendKeysText(WebDriver wd, String uName) {
		GetElement.addText(wd).sendKeys(uName);
	}

		
	public static void clickPostBtn(WebDriver wd) {
		GetElement.postBtn(wd).click();
	}

}
