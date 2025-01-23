package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionsClass {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@href= '/r.php?entry_point=login']")).click();
		driver.findElement(By.name("firstname")).sendKeys("James");
		driver.findElement(By.name("lastname")).sendKeys("Chinappan");
		driver.findElement(By.xpath("//input[@name= 'reg_email__']")).sendKeys("9489600971");
		driver.findElement(By.xpath("//input[@name= 'reg_passwd__']")).sendKeys("Vineethraja@123");
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select dd1 =new Select(dropdown1);
		dd1.selectByIndex(26);
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select dd2 =new Select(dropdown2);
		dd2.selectByValue("8");
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select dd3 =new Select(dropdown3);
		dd3.selectByVisibleText("1983");
		driver.findElement(By.xpath("//input[@value = '2']")).click();
		
	}
}
