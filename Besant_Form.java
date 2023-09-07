package Task;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Besant_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.besanttechnologies.com/");		
		
		driver.findElement(By.xpath("//input[@id='stxtenqname']")).sendKeys("Ibrahim");
		
		 String name = driver.findElement(By.xpath("//input[@id='stxtenqname']")).getAttribute("value");
		 System.out.println("Name :"+name);
		
	
		
		driver.findElement(By.xpath("//input[@id='stxtenqemail']")).sendKeys("ibrahim@gmail.com");
		
		 String email = driver.findElement(By.xpath("//input[@id='stxtenqemail']")).getAttribute("value");
		 System.out.println("Email :"+email);
		 
		driver.findElement(By.xpath("//input[@id='stxtenqmobile']")).sendKeys("9876543210");
		
		 String mobileno = driver.findElement(By.xpath("//input[@id='stxtenqmobile']")).getAttribute("value");
		 System.out.println("Mobile No :"+mobileno);
		
		
		WebElement dropdown=driver.findElement(By.id("stxtenqcourse"));

		Select dropdownlist=new Select(dropdown);
		
		dropdownlist.selectByIndex(97);
		
		System.out.println("Selected Course :"+dropdownlist.getFirstSelectedOption().getText());

		
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//input[@id='enqSubmitId']")).click();
		
		driver.close();
		


	}

}
