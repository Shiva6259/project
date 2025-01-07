package PackageDemo;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Set;
import java.util.Iterator;
class Assignment{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Apple iPhone 15 (128 GB) - Black')])[1]")).click();
		String childelement=driver.findElement(By.xpath("//*[text()='Apple iPhone 13 (128GB) - Midnight']")).getText();
		System.out.println(	driver.findElement(By.xpath("//*[text()='Apple iPhone 13 (128GB) - Midnight']")).getText());
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(childelement);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//		driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-next-rounded\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[@class='a-icon a-icon-previous-rounded']")).click();
//System.out.println(		driver.findElement(By.xpath("//*[contains(text(),'Appliances for your home | Up to 55% off')]")).getText());
//		Thread.sleep(1000);
////		Actions a=new Actions(driver);
//		driver.findElement(By.id("nav-global-location-popover-link")).click();
//		driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("500059");
//		driver.findElement(By.id("GLUXZipUpdate")).click();
//		Thread.sleep(2000);
//		WebElement exact=driver.findElement(By.id("searchDropdownBox"));
//		Select sc=new Select(exact);
//		sc.selectByVisibleText("Baby");
//		System.out.println(sc.getFirstSelectedOption().getText());

//		driver.findElement(By.id("nav-hamburger-menu")).click();
//		driver.findElement(By.id("hmenu-close-icon")).click();
//		driver.findElement(By.linkText("New Releases")).click();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 plus");
//		driver.findElement(By.cssSelector("[value=\"Go\"]")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 15 Plus (128 GB) - Black')]")).click();
//		Set<String>windows=driver.getWindowHandles();
//		Iterator<String> it=windows.iterator();
//		String parentid=it.next();
//		String childid=it.next();
//		//String childid2=it.next();
//		driver.switchTo().window(childid);
//		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[aria-labelledby=\"attach-sidesheet-view-cart-button-announce\"]")).click();
//		Thread.sleep(2000);
////		driver.findElement(By.cssSelector("select[name=\"quantity\"]")).click();
////		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[2]")).click();
//		
//		Select sc=new Select(		driver.findElement(By.cssSelector("select[name=\"quantity\"]")));
//		sc.selectByIndex(2);
//		Thread.sleep(2000);
//		
////System.out.println(		sc.getFirstSelectedOption().getText());
//
//driver.findElement(By.cssSelector("input[value=\"Proceed to checkout\"]")).click();
//		WebElement actualele=		driver.findElement(By.id("s-result-sort-select"));
//		Thread.sleep(2000);
//		Select sc=new Select(actualele);
//		Thread.sleep(2000);
//		sc.selectByIndex(2);
//System.out.println(		sc.getFirstSelectedOption().getText());
//		//System.out.println(sc.selectByValue("Price: Low to High").getText());
		
		
		
		
		
//		Actions a=new Actions(driver);
//		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 plus");
//		driver.findElement(By.cssSelector("[value=\"Go\"]")).click();
////		driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 15 Plus, 256GB, Yellow - AT&T (Renewed)')]")).click();
//		//driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
//	//	driver.findElement(By.linkText("Apple iPhone 15 Plus (128 GB) - Black")).click();
//		driver.findElement(By.partialLinkText("Apple iPhone 15 Plus (128 GB) - Black")).click();
//		Set<String>windows=driver.getWindowHandles();
//		Iterator<String> it=windows.iterator();
//		String parentid=it.next();
//		String childid=it.next();
//		//String childid2=it.next();
//		driver.switchTo().window(childid);
//		
////		driver.findElement(By.id("buy-now-button")).click();
////		
////		//driver.findElement(By.cssSelector("img[alt='Blue']")).click();
////		Thread.sleep(2000);
//
////		driver.findElement(By.xpath("(//*[@id='continue'])[2]")).click();
////		
//		//driver.findElement(By.xpath("(//*[contains(text(),'256 GB')])[1]")).click();
//		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("attach-sidesheet-checkout-button")).click();
//		driver.findElement(By.id("ap_email")).sendKeys("sk735816@gmail.com");		
//		driver.findElement(By.xpath("(//*[@id='continue'])[2]")).click();
//		
////		driver.switchTo().window(childid2);
//		//driver.findElement(By.cssSelector("input[name='proceedToRetailCheckout']")).click();
//		
	}
}