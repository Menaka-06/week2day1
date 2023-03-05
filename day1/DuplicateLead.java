package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
 driver.get("http://leaftaps.com/opentaps/control/login");
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
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MenakaN");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing using Selenium");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("menakan.be@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Duplicate Lead")).click();
	//to clear and fill new field values
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Selenium");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Menaka elavarasan");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	
	
	}

}
