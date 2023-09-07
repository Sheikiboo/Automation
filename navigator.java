package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.besanttechnologies.com/");
		 String title1= driver.getTitle();
		 System.out.println("current title" + title1);
		 
		 Assert.assertEquals(title1, "Online & Classroom Training Courses and Certification | Besant Technologies");
		 Thread.sleep(1000);		 
		 driver.navigate().to("https://bdreamz.com/");
		 String title2= driver.getTitle();
		 System.out.println("Second title" + title2);
		 Assert.assertEquals(title2, "BDreamz Global Solutions Pvt Ltd | IT Resources");
		 Thread.sleep(1000);
		 
		 

		 
		 driver.navigate().back();
		 
		 Assert.assertEquals(title1, "Online & Classroom Training Courses and Certification | Besant Technologies");
		 Thread.sleep(1000);		 

		 
		 driver.navigate().forward();
		 Assert.assertEquals(title2, "BDreamz Global Solutions Pvt Ltd | IT Resources");
		 Thread.sleep(1000);		 

		 driver.quit();
	
	
	}

}
