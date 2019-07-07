package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.Login;
import utility.Constant;
import utility.ExcelData;

public class LoginTest {
	
	//Method for logging in one particular user whose ID from the table matches rNum parameter
	public static void logIn(WebDriver wd,int rNum) throws Exception {
			ExcelData.setFile(Constant.PATH_TESTDATA+Constant.FILE_TESTDATA, Constant.SHEET_REGISTRATION);
			String[] data = new String[5];
			for(int i=0;i<5;i++) {
				data[i] = ExcelData.getData(rNum, i);
			}
			Login.clickUserName(wd);
			Login.sendKeysUserName(wd, data[2]);
			
			Login.clickPassword(wd);
			Login.sendKeysPassword(wd, data[4]);
			
			Login.clickLogInButton(wd);
			Thread.sleep(300);
			//LogIn.logOutButton(driver);
			
		}
	
	//Method for logging in all users from database
	public static void logInAll(WebDriver wd) throws Exception {
		ExcelData.setFile(Constant.PATH_TESTDATA+Constant.FILE_TESTDATA, Constant.SHEET_REGISTRATION);
		for(int i=1;i<ExcelData.rowCount();i++) {//starts from number 1 because the first row is table header
			logIn(wd, i);//calls logIn method i number of times, where i is less then number of rows in table
			Thread.sleep(2000);//then waits two seconds
			Login.clickLogoutButton(wd);//and logs user out, then repeats until it reaches last row
		}
		
	}
	
	//Method to log user in manually
	public static void logInManual(WebDriver wd,Scanner sc) {
		System.out.println("LOG IN");
		
		Login.clickUserName(wd);
		System.out.println("Enter Username");
		Login.sendKeysUserName(wd, sc.next());
		
		Login.clickPassword(wd);
		System.out.println("Enter Password");
		Login.sendKeysPassword(wd, sc.next());
		
		String log = "LOGIN";
		System.out.println("Enter word 'LOGIN' to log in");
		if(sc.next().equals(log)) {
			Login.clickLogInButton(wd);
		} else {
			wd.close();
		}
		
	}
	
}
