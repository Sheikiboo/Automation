package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ibrahim");
		
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("xzcsvzdvda");
		
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);
		System.out.println("Error Message..." +	driver.findElement(By.xpath("//p[@class='error']")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ibrahim");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ibrahim@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876598765");
		
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		Thread.sleep(1000);
		System.out.println("Info Msg..."+driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
		
		//Create a String for storing the infoMsg values
				String str=driver.findElement(By.className("infoMsg")).getText();
				
				//Create String array for storing the split values
				String [] str1=str.split("'");
				
				//Create another String for storing the index 1 value
				String str2=str1[1];
				
				System.out.println("This is the Reset Password :"+str2);
		
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ibrahim");
		
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(str2);
		
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());	
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("logout-btn")).click();		


		
		
		driver.quit();

	}

}
