package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sathu");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BE");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Happy Monday");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathya@gmail.com");
	WebElement eleState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select state = new Select(eleState);
	state.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Keypoints to be noted");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
	
	}

}
