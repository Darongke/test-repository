package latihanautomation.pages;

import java.time.Duration;

import org.testng.annotations.Test;

import latihanautomation.pages.login;
import latihanautomation.pages.profile;

public class login {
	
	public void loginToWebAndSuccess() {
		login loginPage = new login(driver, explicitWait);
		profile profilePage = new profile(driver, explicitWait);
		String username = "ongke";
		String password = "akuadalahs3orangkap!teN";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();

	}

	public void loginToWebNotClickingLoginButton() {
		login loginPage = new login(driver, explicitWait);
		String username = "ongke";
		String password = "akuadalahs3orangkap!teN";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);

		String actualText = loginPage.getBannerText();
		String expectedText = "Profile Page";
	}

	public void loginInvalidPassword() {
		login loginPage = new login(driver, explicitWait);
		profile profilePage = new profile(driver, explicitWait);
		String username = "ongke";
		String password = "akuadalahs3orangkap!ten";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();
		String expectedText = "Invalid username or password!";
	}

	
	public void loginInvalidUsername() {
		login loginPage = new login(driver, explicitWait);
		profile profilePage = new profile(driver, explicitWait);
		String username = "usernameSalah";
		String password = "SuperSecretPassword";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();
		String expectedText = "Invalid username or password!";
	}
}
