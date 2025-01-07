package PackageDemo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Customer Service")).click();
	}

}
