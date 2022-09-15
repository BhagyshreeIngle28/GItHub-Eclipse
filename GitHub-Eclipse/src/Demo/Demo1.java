package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	public WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C://Users//Bhagyshree//eclipse-workspace//JenkinsTestngDemo1//driver//geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Chrome Browser Opened");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://techtic-demo.myshopify.com/password");
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void doLogin() throws InterruptedException {

		// Case - 1 Click on Account
		WebElement StorePassword = driver.findElement(By.id("password"));
		WebElement enterstore = driver.findElement(By.xpath("//button[contains(text(),'Enter')]"));

		
		StorePassword.sendKeys("techtic");
		Thread.sleep(500);
		enterstore.click();
		Thread.sleep(500);
		
		System.out.println(System.getProperty("java.class.path"));
		
	}

}
	