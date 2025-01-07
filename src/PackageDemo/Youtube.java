package PackageDemo;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
	}

}
