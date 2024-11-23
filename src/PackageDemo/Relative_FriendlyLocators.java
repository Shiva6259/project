package PackageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.Iterator;
import java.util.Set;
public class Relative_FriendlyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("[class=\"blinkingText\"]")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=	windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(	driver.findElement(By.cssSelector("[class='im-para red']")).getText());
	String emailId=	driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(parent);
	driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys(emailId);
	//		driver.switchTo().newWindow(WindowType.TAB);
//		Set<String> handles=	driver.getWindowHandles();
//	Iterator<String> it=	handles.iterator();
//	String parent=it.next();
//	String child=it.next();
//	driver.switchTo().window(child);
//	driver.get("https://rahulshettyacademy.com/");
//	String course= driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p\"]")).get(1).getText();
//	driver.switchTo().window(parent);
//	driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(course);
	}
}
