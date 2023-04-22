package week4.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassSales {
	public ChromeDriver driver;
	public ChromeOptions Options;
@BeforeMethod
public void preCondition() {
	Options=new ChromeOptions();
	Options.addArguments("--disable-notifications");
	 driver=new ChromeDriver(Options);
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@123");
	driver.findElement(By.id("Login")).click();
}

@AfterMethod
public void postCondition() {
	driver.quit();
}
}
