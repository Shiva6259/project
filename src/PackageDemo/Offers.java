package PackageDemo;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Offers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> allelements=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> original=	allelements.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sorted=	original.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(original.equals(sorted));
	List<String> price=	allelements.stream().filter(s->s.getText().contains("Beans")).map(s->getveggie(s)).collect(Collectors.toList());
	price.forEach(s->System.out.println(s));
	}
	private static String getveggie(WebElement s) {
	String price=	s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
		return price;
	}
	
}
