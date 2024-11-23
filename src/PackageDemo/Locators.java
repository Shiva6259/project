package PackageDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		String name="Shivakumar";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String actualpassword=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//System.out.println(driver.getTitle());//https://rahulshettyacademy.com/
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(actualpassword);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
	}
public static String getpassword(WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String passwordArray=driver.findElement(By.cssSelector("form p")).getText();
	// 0th Please use temp password
		//1st rahulshettyacademy to login
	String[] passwordArray1=passwordArray.split("'");
	String password=passwordArray1[1].split("'")[0];
	return password;
}
}
