package com.actitime.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
public WebDriver driver;
  @BeforeTest
  public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
  public void closeBrowser() {
driver.quit();
}
  @BeforeMethod
public void login() {

}
  public void logout() {

}
}
