package week4.Day4;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;


public class ArchitectCertificate extends BaseClassSales {
	@Test(invocationCount=1,threadPoolSize=2)
public void runArchitectCertificate() throws InterruptedException {
		
		
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
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		String Summary=driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center Lh(1.5)')]")).getText();
		System.out.println("SUMMARY:     "+Summary);
		System.out.println("-------------------------------------------------------------------");
		                           
		
		List<WebElement> Certificates=driver.findElements(By.xpath("(//div[@class='credentials-card_title']//a)"));
		int count=Certificates.size();
		System.out.println("Architect Certifications  ");
			System.out.println("------------------------");
		for (int i = 1; i <=count; i++) {
			
			String Architects=driver.findElement(By.xpath("(//div[@class='credentials-card_title']//a)["+i+"]")).getText();
			System.out.println(Architects);
			
		}
		System.out.println("-------------------------------------------------------------------");
		driver.findElement(By.xpath("(//a[@href='/en/credentials/applicationarchitect'])[2]")).click();
		Thread.sleep(2000);
		List<WebElement> AplcnCertificates=driver.findElements(By.xpath("(//div[@class='credentials-card_title']//a)"));
		int count1=AplcnCertificates.size();
		System.out.println("Application Architect Certificates ");
		System.out.println("----------------------------------");					
		for (int j = 1; j <=count1; j++) {
			
			String AppArchitects=driver.findElement(By.xpath("(//div[@class='credentials-card_title']//a)["+j+"]")).getText();
			System.out.println(AppArchitects);
			
		}
		driver.quit();
		
}
}
