package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");

		driver.findElement(By.id("email")).sendKeys("Sathya@gmail.com");
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("Added");
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value"));

		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input[@name='username']")).clear();
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled());



	}

}
