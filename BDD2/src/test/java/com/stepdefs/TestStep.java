package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	WebDriver driver=null;
	@Given("^user on login page$")
	public void user_on_login_page() throws Throwable {
	  System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("C:/seleniumsoftware/Offline%20Website/Offline%20Website/index.html");
	  
	}

	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String username, String password) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   driver.findElement(By.xpath("//button")).click();
	   driver.get("C:/seleniumsoftware/Offline%20Website/Offline%20Website/index.html");
	   
	}
	    
	    
	

	@Then("^user verify \"([^\"]*)\"$")
	public void user_verify(String title) throws Throwable {
	   Assert.assertEquals("JavaByKiran | "+title,driver.getTitle());
	}
	@Then("^user Should see JBK logo$")
	public void user_Should_see_JBK_logo() throws Throwable {
	WebElement logo=driver.findElement(By.tagName("img"));
	Assert.assertTrue(logo.isDisplayed());
	   
	}


}
