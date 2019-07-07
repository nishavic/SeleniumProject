package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.Dashboard;
import objects.Registration;
import utility.Constant;
import utility.ExcelData;

public class PostTest {
	//Method for creating a post from database
	public static void createOnePostFromDB(WebDriver wd, int rNum) throws Exception {
		ExcelData.setFile(Constant.PATH_TESTDATA+Constant.FILE_TESTDATA, Constant.SHEET_POST);
		String[] data = new String[3];
		for(int i=0;i<3;i++) {			
			data[i] = ExcelData.getData(rNum, i);
		}
		Dashboard.clickMakePost(wd);
		Dashboard.clickNaziv(wd);
		Dashboard.sendKeysAddName(wd, data[1]);
		
		Dashboard.clickLokacija(wd);
		Dashboard.sendKeysLokacija(wd, data[2]);
		
		//Dashboard.sendKeysPicture(wd, "C:\\Users\\MDPI\\Pictures\\image.jpg");
		
		Dashboard.selectTransport(wd, "Bus");
		
		Dashboard.clickText(wd);
		Dashboard.sendKeysText(wd, data[0]);
		
		Dashboard.clickPostBtn(wd);
		
	}
	
	//Method for generating all the posts from database
	public static void createAllPosts(WebDriver wd) throws Exception {
		ExcelData.setFile(Constant.PATH_TESTDATA+Constant.FILE_TESTDATA, Constant.SHEET_POST);
		
		for(int i=1;i<ExcelData.rowCount();i++) {
			createOnePostFromDB(wd, i);
		}
	}
	
	//Method for generating a single post manually
	public static void createPostManual(WebDriver wd,Scanner sc) {
		Dashboard.clickMakePost(wd);
		System.out.println("CREATE POST");
		
		System.out.println("Enter Name");
		Dashboard.clickNaziv(wd);
		Dashboard.sendKeysAddName(wd, sc.nextLine());
		
		System.out.println("Enter Location");
		Dashboard.clickLokacija(wd);
		Dashboard.sendKeysLokacija(wd, sc.nextLine());
		
		//System.out.println("Enter path to the picture, or select it manually");
		//Dashboard.sendKeysPicture(wd, "C:\\Users\\MDPI\\Pictures\\image.jpg");
		
		System.out.println("Select the mode of transportation:");
		Dashboard.selectTransport(wd, sc.nextLine());
		
		System.out.println("Enter Text");
		Dashboard.clickText(wd);
		Dashboard.sendKeysText(wd, sc.next());
		
		Dashboard.clickPostBtn(wd);
	}

}
