package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	private static String TXT_AREA_CSS_SELECTOR = "textarea#APjFqb";
	private static String BTN_SEARCH_NAME = "btnK";

	public static void main(String[] args) throws Exception {

		getDriver().manage().window().maximize();
		getDriver().get("https://www.google.com");
		getTextArea().sendKeys("Selenium");
		getBtnSearch().click();
		Thread.sleep(2000);
		getDriver().quit();
	}

	public static WebDriver getDriver() {
		return new ChromeDriver();
	}

	public static WebElement getTextArea() {
		return getDriver().findElement(By.cssSelector(TXT_AREA_CSS_SELECTOR));
	}

	public static WebElement getBtnSearch() {
		return getDriver().findElement(By.name(BTN_SEARCH_NAME));
	}

}
