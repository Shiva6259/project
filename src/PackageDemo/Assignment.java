package PackageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.support.ui.Select;
public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value=\"BLR\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"MAA\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(1000);
//		for(int i=1;i<5;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		Thread.sleep(1000);
//		WebElement selectdp=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown=new Select(selectdp);
//		Thread.sleep(1000);
//		dropdown.selectByIndex(2);
		String Name="Shiva Kumar";
		driver.findElement(By.cssSelector("input[class=\"inputs\"]")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@value=\"Alert\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.quit();
	}

}
