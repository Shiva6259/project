package PackageDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
public class WaitsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[type=\"radio\"][value=\"user\"]")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		WebElement dropdowns=driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown=new Select(dropdowns);
		dropdown.selectByValue("consult");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.cssSelector("input[value=\"Sign In\"]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> products=driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<products.size();i++) {
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		
	}

}
