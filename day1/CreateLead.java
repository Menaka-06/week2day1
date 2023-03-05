package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Menaka");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nagarajan");
		
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(source);
		drop1.selectByVisibleText("Conference");
		
		WebElement mrktcmpgn = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2=new Select(mrktcmpgn);
		drop2.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement ownrship = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3=new Select(ownrship);
		drop3.selectByIndex(5);
		
		WebElement countryval = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop4=new Select(countryval);
		drop4.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("driver.getTitle()");
		
		
	}

}
