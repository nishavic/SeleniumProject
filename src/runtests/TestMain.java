package runtests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.DeletePost;
import objects.Homepage;
import tests.LoginTest;
import tests.PostEditTest;
import tests.PostTest;
import tests.RegistrationTest;
import utility.ExcelData;

public class TestMain {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MDPI\\Desktop\\QA\\cwd\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		Scanner sc = new Scanner(System.in);

		Homepage.goToHomePage(wd);

		System.out.println(
				"Welcome to Izlet testing! \n" + "To test registration, press 1\n" + "To test logging in, press 2 \n"
						+ "To test managing posts, press 3. For this you have to be logged in");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			while (true) {
				System.out.println("Do you want to test automatic or manual registration? \n"
						+ "For automatic, press 1 \n" + "For manual, press 2.");
				int option = sc.nextInt();
				if (option == 1) {
					System.out.println("To register all users from database, press 0 \n"
							+ "To register a particular user, enter hers or his ID");
					int autoReg = sc.nextInt();
					if (autoReg == 0)
						RegistrationTest.registerAllUsers(wd);
					else if (autoReg > 0) {
						RegistrationTest.registerNewUser(wd, autoReg);
					} else {
						System.out.println("Invalid input");
						continue;
					}
					break;
				} else if (option == 2) {
					RegistrationTest.regNewUserManual(wd, sc);
				} else {
					System.out.println("Invalid input");
					continue;
				}
				break;
			}

		case 2:
			while (true) {
				System.out.println("For automatic logging in, press 1 \n" + "For manual logging in, press 2");
				int option = sc.nextInt();
				if (option == 1) {
					System.out.println("To log in and then log out all users from database, press 0 \n"
							+ "To log in a particular user, enter hers or his ID");
					int autoLog = sc.nextInt();
					if (autoLog == 0)
						LoginTest.logInAll(wd);
					else if (autoLog > 0) {
						LoginTest.logIn(wd, autoLog);
					} else {
						System.out.println("Invalid input");
						continue;
					}
					break;
				} else if (option == 2) {
					LoginTest.logInManual(wd, sc);
				} else {
					System.out.println("Invalid input");
					continue;
				}
				break;
			}

		case 3:
			System.out.println("How would you like to manage posts? \n" + "To make a new post, press 1 \n"
					+ "To edit an existing post, press 2 \n" + "To delete 2 most recent posts, press 3");
			int choose = sc.nextInt();

			while (true) {
				if (choose == 1) {
					System.out.println(
							"To generate post automatically, press 1 \n" + "To generate post manually, press 2");
					int option = sc.nextInt();
					if (option == 1) {
						System.out.println("To generate all the posts from database, press 0 \n"
								+ "To generate a particular post, enter the ID of the post");
						int autoPost = sc.nextInt();
						if (autoPost == 0) {
							PostTest.createAllPosts(wd);
						} else if (autoPost > 0) {
							PostTest.createOnePostFromDB(wd, autoPost);
						} else {
							System.out.println("Invalid input");
							continue;
						}
						break;
					} else if (option == 2) {
						PostTest.createPostManual(wd, sc);
					} else {
						System.out.println("Invalid input");
						continue;
					}
				} else if (choose == 2) {
					PostEditTest.postEditManual(wd, sc);
					break;
				} else if (choose == 3) {
					DeletePost.postDelete(wd, 2);
					break;
				}
			}

		default:
			System.out.println("Invalid input");

			sc.close();
			wd.quit();
		}
	}
}
