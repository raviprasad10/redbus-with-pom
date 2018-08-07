package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element;
	
	public static WebElement source(WebDriver driver) {
		element=driver.findElement(By.id("src"));
		return element;
	}
	
	public static WebElement destination(WebDriver driver) {
		element=driver.findElement(By.id("dest"));
		return element;
	}


}
