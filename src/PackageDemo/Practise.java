package PackageDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(	driver.findElements(By.tagName("a")).size());	
	WebElement Footer=	driver.findElement(By.id("gf-BIG"));
System.out.println(	Footer.findElements(By.tagName("a")).size());
WebElement columndriver=Footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(	columndriver.findElements(By.tagName("a")).size());
	for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
		
		String links=Keys.chord(Keys.CONTROL,Keys.ENTER);
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(links);
		Thread.sleep(5000);
	}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String>li=abc.iterator();
		while(li.hasNext()) {
			driver.switchTo().window(li.next());
			System.out.println(driver.getTitle());
		}
	}
	}


