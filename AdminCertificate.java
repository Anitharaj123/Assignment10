package week4.Day4;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AdminCertificate extends BaseClassSales {
	@Test(invocationCount=1,threadPoolSize=2)
	
public void runAdminCertificate() throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		//WindowHandling
		Set<String> WindowHAndling=driver.getWindowHandles();
		List<String> Links=new ArrayList<String>(WindowHAndling);
		driver.switchTo().window(Links.get(1));
		driver.findElement(By.xpath("(//div[@class='dialog']//button)[2]")).click();
		
		Shadow dd=new Shadow(driver);
		dd.setImplicitWait(20);
		dd.findElementByXPath("//span[text()='Learning']").click();
		WebElement elment=dd.findElementByXPath("//span[text()='Learning on Trailhead']");
	
		Actions hover=new Actions(driver);
		hover.moveToElement(elment).perform();
		WebElement Elementclick=dd.findElementByXPath("//a[text()='Salesforce Certification']");
		
		hover.moveToElement(Elementclick).perform();
		Elementclick.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Administrator")).click();
		
	    List<WebElement> listOfCertificates=driver.findElements(By.xpath("(//div[@class='trailMix-card-body_title']//a)"));
		int count=listOfCertificates.size();
		Thread.sleep(2000);
			for (int i = 1; i <= count; i++) {
				String certificates=driver.findElement(By.xpath("(//div[@class='trailMix-card-body_title']//a)["+i+"]")).getText();
				
				System.out.println(certificates);
				
			}
		
//		String certificates=driver.findElement(By.xpath("(//div[@class='trailMix-card-body_title']//a)[i]")).getText();
//		listOfCertificates.add(certificates);
//		System.out.println(string);
		}
		//(//div[@class='trailMix-card-body_title']//a)[i]
		
		
		
	
		

}
