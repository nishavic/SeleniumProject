package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetElement {
	//Static attributes with xpath values for registration form fields
	public static final String FIRST_NAME = "//input[@name='firstname']";
	public static final String LAST_NAME = "//input[@name='lastname']";
	public static final String USER_NAME = "//form[@action='processregister.php']//input[@name='username']";
	public static final String EMAIL = "//input[@name='email']";
	public static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	public static final String REG_BUTTON = "//input[@value='Register']";
	
	//Static attributes with xpath values for login form fields
	public static final String LOGIN_USERNAME = "//input[@placeholder='username']";
	public static final String LOGIN_PASSWORD = "//input[@placeholder='password']";
	public static final String LOGIN_BTN = "//input[@value='Log in']";
	
	//Static attributes with xpath values for post form fields
	public static final String MAKE_POST = "//a[contains(text(),'Make a post')]";
	public static final String POST_NAME = "//input[@placeholder='Naziv']";
	public static final String POST_LOCATION = "//input[@placeholder='Lokacija']";
	public static final String POST_IMG = "//label[@class='custom-file-upload']";
	public static final String TRANSPORT = "//select[@name='transport']";
	public static final String POST_BODY = "//textarea[@placeholder='Opis']";
	public static final String POST_BTN = "//input[@value='Post']";
	public static final String LOGOUT_BTN = "//a[@id='logoutBtn']";
	
	//Static attributes with xpath values for edit post fields
	public static final String THREE_DOTS_ICON = "//i[@class='fas fa-ellipsis-v']";
	public static final String EDIT_POST_ICON = "//i[@class='fas fa-edit']";
	public static final String DELETE_POST_ICON = "css=.posts:nth-child(7) .location > a > .fas";// css selector
	public static final String EDIT_TITLE = "//input[@id='title']";
	public static final String EDIT_LOCATION = "//input[@id='location']";
	public static final String EDIT_PIC = "custom-file-upload";
	public static final String EDIT_TRANSPORT = "//select[@id='transport']";
	public static final String EDIT_TEXT = "//textarea[@id='description']";
	public static final String POST_BUTTON = "//div[@class='popupEdit']//input[@value='Post']";

	
	//Methods for getting registration form fields and buttons
	public static WebElement firstName(WebDriver wd) {
		return wd.findElement(By.xpath(FIRST_NAME));
	}
	
	public static WebElement lastName(WebDriver wd) {
		return wd.findElement(By.xpath(LAST_NAME));
	}
	
	public static WebElement userName(WebDriver wd) {
		return wd.findElement(By.xpath(USER_NAME));
	}
	
	public static WebElement email(WebDriver wd) {
		return wd.findElement(By.xpath(EMAIL));
	}

	public static WebElement password(WebDriver wd) {
		return wd.findElement(By.xpath(PASSWORD));
	}
	
	public static WebElement registrationBtn(WebDriver wd) {
		return wd.findElement(By.xpath(REG_BUTTON));
	}

	//Methods for getting login form fields and buttons
	public static WebElement loginUser(WebDriver wd) {
		return wd.findElement(By.xpath(LOGIN_USERNAME));
	}

	public static WebElement loginPassword(WebDriver wd) {
		return wd.findElement(By.xpath(LOGIN_PASSWORD));
	}
	
	public static WebElement logInButton(WebDriver wd) {
		return wd.findElement(By.xpath(LOGIN_BTN));
	}
	
	public static WebElement logOutButton(WebDriver wd) {
		return wd.findElement(By.xpath(LOGOUT_BTN));
	}
	
	//Methods for getting post fields and buttons
	public static WebElement makePost(WebDriver wd) {
		return wd.findElement(By.xpath(MAKE_POST));
	}
	
	public static WebElement naziv(WebDriver wd) {
		return wd.findElement(By.xpath(POST_NAME));
	}
	
	public static WebElement lokacija(WebDriver wd) {
		return wd.findElement(By.xpath(POST_LOCATION));
	}
	
	public static WebElement addPicture(WebDriver wd) {
		return wd.findElement(By.id(POST_IMG));
	}
	
	public static Select addTransport(WebDriver wd) {
		Select addTransport = new Select(wd.findElement(By.xpath(TRANSPORT)));
		return addTransport;
	}
	
	public static WebElement addText(WebDriver wd) {
		return wd.findElement(By.xpath(POST_BODY));
	}
	
	public static WebElement postBtn(WebDriver wd) {
		return wd.findElement(By.xpath(POST_BTN));
	}
	
	//Methods for getting edit post fields and buttons
	public static WebElement editTitle(WebDriver wd) {
		return wd.findElement(By.xpath(EDIT_TITLE));
	}
	
	public static WebElement editLokacija(WebDriver wd) {
		return wd.findElement(By.xpath(EDIT_LOCATION));
	}
	
	public static WebElement editPicture(WebDriver wd) {
		return wd.findElement(By.className(EDIT_PIC));
	}
	
	public static Select editTransport(WebDriver wd) {
		Select editTransport = new Select(wd.findElement(By.xpath(EDIT_TRANSPORT)));
		return editTransport;
	}
	
	public static WebElement editText(WebDriver wd) {
		return wd.findElement(By.xpath(EDIT_TEXT));
	}
	
	public static WebElement editPostBtn(WebDriver wd) {
		return wd.findElement(By.xpath(POST_BUTTON));
	}
}
