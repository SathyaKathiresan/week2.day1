package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//To setup the driver
		WebDriverManager.chromedriver().setup();
		// To open the browser
		ChromeDriver driver = new ChromeDriver();
		// To load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// To maximize the page
		driver.manage().window().maximize();
		// To Minimize the page
		//	driver.manage().window().minimize();
		//Login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		// click SRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click Leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kathiresan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sathu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Happy Sunday");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathya@gmail.com");
		// select source
		WebElement eleSelect = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(eleSelect);
		source.selectByVisibleText("Conference");
		// select state
		WebElement eleState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(eleState);
		state.selectByVisibleText("New York");
		//submit Create Lead form
		driver.findElement(By.name("submitButton")).click();
		//Getting Title
		String title = driver.getTitle();
		System.out.println(title);



	}

}
