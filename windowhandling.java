package Task;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.besanttechnologies.com/");
		
		
		driver.findElement(By.xpath("//div[@id='navbarNavDropdown'] //a[@title='Job Seekers']")).click();
		
		System.out.println(driver.getWindowHandles());
		
		Set<String> allwindows = driver.getWindowHandles();
		
		Iterator<String> it = allwindows.iterator();
		
		String parent=it.next();
		
		System.out.println(driver.getTitle());
		
		String child= it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ibrahim");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543210");
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ibrahim@gmail.com");
		
		WebElement options = driver.findElement(By.id("experience"));
		Select dropdown = new Select(options);
		dropdown.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='passout']")).sendKeys("2023");
		
		WebElement dropdownlist = driver.findElement(By.id("degree"));
		
		Select degree = new Select(dropdownlist);
		
		degree.selectByValue("MCA");
		
		Thread.sleep(1000);
		
		WebElement coursecertificate = driver.findElement(By.id("certi"));
		
		Select certificate = new Select(coursecertificate);
		
		certificate.selectByVisibleText("Yes");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='course']")).sendKeys("Software Testing");
		
		driver.findElement(By.id("wherecourse")).sendKeys("Besant Technologies");
		
		driver.findElement(By.id("skill")).sendKeys("Software Testing");
		
		driver.findElement(By.id("location")).sendKeys("Tirunelveli");

		driver.findElement(By.id("about")).sendKeys("Wants to upgrade");
		
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(1000);		
		System.out.println(driver.findElement(By.id("errorMsg")).getText());
		
		
		File imgsss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(imgsss, new File("C:\\Users\\windows\\Desktop\\screenshot-testing\\imgsss.png"));
		
		

		
		
		
		driver.quit();

	}

}
