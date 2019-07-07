package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.EditPost;

public class PostEditTest {
	//Method for editing post manually
	public static void postEditManual(WebDriver wd, Scanner sc) {
		EditPost.postEdit(wd);
		
		System.out.println("Enter Title");
		EditPost.clickEditTitle(wd);
		EditPost.sendKeysEditTitle(wd, sc.next());
		
		System.out.println("Enter Location");
		EditPost.clickEditLokacija(wd);
		EditPost.sendKeysEditLokacija(wd, sc.next());
		
		//EditPost.sendKeysEditPicture(wd, "C:\\Users\\MDPI\\Pictures\\image2.jpg");
		
		System.out.println("Please select mode of transportation:");
		EditPost.setTransport(wd, sc.nextLine());
		
		System.out.println("Enter Text");
		EditPost.clickEditText(wd);
		EditPost.sendKeysEditText(wd, sc.next());
		
		EditPost.clickEditPostBtn(wd);
	}

}
