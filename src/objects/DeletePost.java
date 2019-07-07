package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeletePost {
	// delete post last 2 posts
		public static void postDelete(WebDriver wd, int deleteNum) {
			for (int i = 0; i <= deleteNum; i++) {
				List<WebElement> threeDots = wd.findElements(By.xpath(GetElement.THREE_DOTS_ICON));
				threeDots.get(0).click();
				List<WebElement> deletePost = wd.findElements(By.xpath(GetElement.DELETE_POST_ICON));
				deletePost.get(0).click();

			}
		}
}
