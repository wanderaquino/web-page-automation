package br.wcruz.pb.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FactoryDriver {
	
	private static WebDriver driver;
	private static final String HEADlESS_OPTION = "--headless";
	
	private FactoryDriver () {
		
	};
	
	public static WebDriver getDriver() {
		if(driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments(HEADlESS_OPTION);
			driver = new ChromeDriver(options);

		}
		return driver;
	}
	
	public static WebDriver releaseDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
		return driver;
	}
}