package PackageDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Static_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown=new Select(staticdropdown);
//		dropdown.selectByIndex(2);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("USD");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("INR");
//		System.out.println(	dropdown.getFirstSelectedOption().getText());
//		driver.findElement(By.id("divpaxinfo")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		Thread.sleep(2000);
//		for(int i=1;i<5;i++) {
//		driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value=\"IXB\"])[2]")).click();
//		System.out.println(driver.findElement(By.xpath("//a[@value='MAA']")));
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value=\"AMD\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"MAA\"]")).click();
//		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//		Thread.sleep(2000);
//		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//		for(WebElement option:options) {
//			if(option.getText().equals("India")){
//				option.click();
//			}
//		}
//		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
//	System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
//	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());	
	driver.quit();
	}

}
