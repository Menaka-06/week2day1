package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("DebitLimitedAccount");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("SeleniumAutomationTester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("MenakaN");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Nanganallur");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("100000");
		
		WebElement industryname = driver.findElement(By.name("industryEnumId"));
		Select drop=new Select(industryname);
		drop.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select drop1=new Select(ownership);
		drop1.selectByVisibleText("S-Corporation");
		
		WebElement employee = driver.findElement(By.id("dataSourceId"));
		Select drop2=new Select(employee);
		drop2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingcampgn = driver.findElement(By.id("marketingCampaignId"));
		Select drop3= new Select(marketingcampgn);
		drop3.selectByIndex(5);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4= new Select(state);		
		drop4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
