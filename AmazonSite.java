package Task;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement dropdownlist = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select dropdown = new Select(dropdownlist);
		dropdown.selectByVisibleText("Clothing & Accessories");
		Thread.sleep(1000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("india team");
		Thread.sleep(1000);
		
		List <WebElement> options = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("india team jersey"));
			option.click();
			break;
		}
		
		List<WebElement> jersys = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		for(WebElement jersy : jersys) {
			if(jersy.getText().equalsIgnoreCase("Sports India Team Jersey")) {
				jersy.click();
				break;
			}

		}
		
		Set <String> allwindows = driver.getWindowHandles();
		
		Iterator<String> it = allwindows.iterator();
		
		String parent= it.next();
		System.out.println(parent);
		
		String child = it.next();
		
		driver.switchTo().window(child);
		System.out.println(child);

		
		WebElement quantitylist =driver.findElement(By.xpath("//select[@id='quantity']"));
		Select quantity = new Select(quantitylist);
		quantity.selectByVisibleText("3");
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
	}

}
