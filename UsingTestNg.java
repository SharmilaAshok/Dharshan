package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class UsingTestNg {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
	}
@Ignore		
@Test
public void testBox() throws InterruptedException {
	driver.findElement(By.xpath("//span[.='Text Box']")).click();
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Sharmila",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("writemesharmi@gmail.com",Keys.ENTER);
	driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Madambakkam",Keys.ENTER);
	driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Madambakkam",Keys.ENTER);
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	WebElement e = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	action.moveToElement(e).click().build().perform();
	}
@Ignore
@Test
public void checkBox() {
	driver.findElement(By.xpath("//span[.='Check Box']")).click();
	driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
	}
@Ignore
@Test
public void radioButton() throws InterruptedException {
	driver.findElement(By.xpath("//span[.='Radio Button']")).click();
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	WebElement e1 = driver.findElement(By.xpath("//input[@id='yesRadio']"));
	action.moveToElement(e1).click().build().perform();
	}
@Ignore
@Test
public void webTables() throws InterruptedException {
	driver.findElement(By.xpath("//span[.='Web Tables']")).click();
	driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sharmila",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ashok",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Writemesharmi@gmail.com",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='age']")).sendKeys("33",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("20000",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Testing",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Submit']")).click();
}
@Ignore
@Test 
public void button() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,150)");
	Actions action = new Actions(driver);
	WebElement e2 = driver.findElement(By.xpath("//span[.='Buttons']"));
	action.moveToElement(e2).click().build().perform();
	Thread.sleep(2000);
	WebElement e3 = driver.findElement(By.xpath("//button[.='Double Click Me']"));
	action.moveToElement(e3).doubleClick().build().perform();
	WebElement a1 =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	action.moveToElement(a1).contextClick().build().perform();
	driver.findElement(By.xpath("//button[.='Click Me']")).click();
	
	

}
@Ignore
@Test
public void links() {
	Actions action = new Actions(driver);
	WebElement e5 = driver.findElement(By.xpath("//span[.='Links']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	action.moveToElement(e5).click().build().perform();
	driver.findElement(By.xpath("//a[.='Home']")).click();
	driver.findElement(By.xpath("//a[@id='dynamicLink']")).click();
}
@Ignore
@Test
public void brokenLink () throws InterruptedException {
	Actions action = new Actions(driver);
	WebElement e6 = driver.findElement(By.xpath("//span[.='Broken Links - Images']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	action.moveToElement(e6).click().build().perform();
	//driver.findElement(By.xpath("//a[.='Click Here for Valid Link']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[@href=\"http://the-internet.herokuapp.com/status_codes/500/\"]"));
	//driver.findElement(By.xpath("//a[.='Click Here for Broken Link']")).click();
	js.executeScript("window.scrollBy(0,200)");
	driver.findElement(By.xpath("//a[@href=\"http://the-internet.herokuapp.com/status_codes/500\"]")).click();
	}

@Test
public void uploadAndDownload() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,275)");
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	WebElement e7 = driver.findElement(By.xpath("//span[.='Upload and Download']"));
	action.moveToElement(e7).click().build().perform();
	WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadFile']"));
	uploadElement.sendKeys("C:\\SeleniumScreenShot\\dharshan.jpg");
	driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
	
}
@AfterTest
public void close() {
}
}



