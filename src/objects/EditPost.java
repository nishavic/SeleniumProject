package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPost {
	public static void postEdit(WebDriver wd) {
		List<WebElement> threeDots = wd.findElements(By.xpath(GetElement.THREE_DOTS_ICON));
		List<WebElement> editPost = wd.findElements(By.xpath(GetElement.EDIT_POST_ICON));
		threeDots.get(0).click();
		editPost.get(0).click();
	}

	// Methods for editing post title
	public static void clickEditTitle(WebDriver wd) {
		GetElement.editTitle(wd).click();
		GetElement.editTitle(wd).clear();
	}
	public static void sendKeysEditTitle(WebDriver wd, String title) {
		GetElement.editTitle(wd).sendKeys(title);
	}

	// Methods for editing post location
	public static void clickEditLokacija(WebDriver wd) {
		GetElement.editLokacija(wd).click();
		GetElement.editLokacija(wd).clear();
	}
	public static void sendKeysEditLokacija(WebDriver wd, String location) {
		GetElement.editLokacija(wd).sendKeys(location);
	}

	// Method for editing picture
	public static void sendKeysEditPicture(WebDriver wd, String picPath) {
		GetElement.editPicture(wd).sendKeys(picPath);
	}

	// Method for editing transport mode
	public static void setTransport(WebDriver wd, String mode) {
		GetElement.editTransport(wd).selectByVisibleText(mode);
	}

	// Method for editing post body
	public static void clickEditText(WebDriver wd) {
		GetElement.editText(wd).click();
		GetElement.editText(wd).clear();
	}
	public static void sendKeysEditText(WebDriver wd, String text) {
		GetElement.editText(wd).sendKeys(text);
	}
	
	// Method for clicking on Edit post button
	public static void clickEditPostBtn(WebDriver wd) {
		GetElement.editPostBtn(wd).click();
	}
}
