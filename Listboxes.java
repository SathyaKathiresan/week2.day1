package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listboxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select progarm1 = new Select(dd1);
		progarm1.selectByIndex(1);
		
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select progarm2 = new Select(dd2);
		progarm2.selectByVisibleText("Loadrunner");
		
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select progarm3 = new Select(dd3);
		progarm3.selectByValue("2");
		
		WebElement dd4 = driver.findElement(By.className("dropdown"));
		Select program4 = new Select(dd4);
		System.out.println(program4.getOptions().size());
		
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("UFT/QTP");
		
		driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[@value='2']")).click();
		
		
		

	}

}
