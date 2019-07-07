package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.Registration;
import utility.Constant;
import utility.ExcelData;

public class RegistrationTest {
	//Method for registering a user from database whose ID matches rNum parameter
	public static void registerNewUser(WebDriver wd,int rNum) throws Exception {
		ExcelData.setFile(Constant.PATH_TESTDATA+Constant.FILE_TESTDATA, Constant.SHEET_REGISTRATION);
		String[] data = new String[5];
		for(int i=0;i<5;i++) {			
			data[i] = ExcelData.getData(rNum, i);
		}
		Registration.clickFirstName(wd);
		Registration.sendKeysFirstName(wd, data[0]);
		
		Registration.clickLastName(wd);
		Registration.sendKeysLastName(wd, data[1]);
		
		Registration.clickuserName(wd);
		Registration.sendKeysUserName(wd, data[2]);
		
		Registration.clickemail(wd);
		Registration.sendKeysEmail(wd, data[3]);
		
		Registration.clickPassword(wd);
		Registration.sendKeysPassword(wd, data[4]);
		
		Registration.clickRegButton(wd);
	}
	
	//Method for registering all users from database
	public static void registerAllUsers(WebDriver wd) throws Exception {
		ExcelData.setFile(Constant.PATH_TESTDATA+Constant.FILE_TESTDATA, Constant.SHEET_REGISTRATION);
		for(int i=1;i<ExcelData.rowCount();i++) {
			registerNewUser(wd, i);
		}
	}
	
	//Method for registering a single user manually
	public static void regNewUserManual(WebDriver wd,Scanner sc) {
		Registration.clickFirstName(wd);
		System.out.println("Enter First Name");
		Registration.sendKeysFirstName(wd, sc.next());
		
		Registration.clickLastName(wd);
		System.out.println("Enter Last Name");
		Registration.sendKeysLastName(wd, sc.next());
		
		Registration.clickuserName(wd);
		System.out.println("Enter User Name");
		Registration.sendKeysUserName(wd, sc.next());
		
		Registration.clickemail(wd);
		System.out.println("Enter E-mail");
		Registration.sendKeysEmail(wd, sc.next());
		
		Registration.clickPassword(wd);
		System.out.println("Enter Password");
		Registration.sendKeysPassword(wd, sc.next());
		
		System.out.println("Enter word 'REGISTER' to register new user");
		
		String reg = "REGISTER";
		if(sc.next().equals(reg)) {
			Registration.clickRegButton(wd);
		} else {
			wd.close();
		}
	}
}
