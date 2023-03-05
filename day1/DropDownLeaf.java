package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownLeaf {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement selecttool = driver.findElement(By.className("ui-selectonemenu"));
		Select drop=new Select(selecttool);
		drop.selectByVisibleText("Selenium");
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Select"))
		{
			System.out.println("Automation is selected");
		}
		else
		{
			System.out.println("Not selected");
		}
		
			}
	

}
