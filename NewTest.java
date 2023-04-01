package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Index");
		}
	

	@Test
	public void test() {
	driver.findElement(By.xpath("//a[.='Create New']")).click();
//	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Marthu",Keys.ENTER);
//	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Sharmi",Keys.ENTER);
//	driver.findElement(By.xpath("//input[@id='EnrollmentDate']")).sendKeys("3-25-2023",Keys.ENTER);
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@AfterTest
	public void afterTest() {
	}

}
