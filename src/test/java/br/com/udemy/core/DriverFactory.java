package br.com.udemy.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static WebDriver browser;
	
	public static WebDriver getDriver() {
		if(browser == null) {
			WebDriverManager.chromedriver().setup();
			browser = new ChromeDriver();
		}
		return browser;
	}
	
	public static void killDriver() {
		if (browser != null) {
			browser.quit();
			browser = null;
		}
	}
}
