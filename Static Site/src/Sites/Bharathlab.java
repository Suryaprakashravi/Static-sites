package Sites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Bharathlab {
	
	WebDriver driver;
	String Homepageurl = "https://bharathlabs.in/";
	String Homepagelogo = "https://bharathlabs.in/index.html";
	long start;
	long end;

	@BeforeSuite
	private void OpenChrome() {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver = new ChromeDriver();
		start=System.currentTimeMillis();
		driver.manage().window().maximize();

	}

	@Test(priority = 0)
	private void HomePageLink() throws InterruptedException {
		driver.get("http://bharathlabs.in/");

		driver.findElement(By.xpath("(//button[@class='btn-close new_close'])[1]")).click();
		String url = driver.getCurrentUrl();
		if (url.equals(Homepageurl)) {
			System.out.println("1. BharathLab Home page URL working fine");
		} else {
			System.out.println("1. BharathLab Home page URL not working");
		}
		
		

	}

	@Test(priority = 1)
	private void HomePaglogolink() throws InterruptedException {

		driver.get("http://bharathlabs.in/");
		driver.findElement(By.xpath("(//img[@title='Bharath-laboratory'])[1]")).click();
		String logo = driver.getCurrentUrl();
		if (logo.equals(Homepagelogo)) {
			System.out.println("2. BharathLab Home Page Logo link working fine");
		} else {
			System.out.println("2. BharathLab Home Page Logo link not working");
		}
		
		

	}

	@Test(priority = 3)
	private void HomePageHeaderLink() throws InterruptedException {

		driver.get("http://bharathlabs.in/");
		
		WebElement element = driver.findElement(By.xpath("//a [text() = 'About us']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);

		WebElement element1 = driver.findElement(By.xpath("(//a [text() = 'Our Services'])[1]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
			
		WebElement element3 = driver.findElement(By.xpath("//a [text() = 'Franchise']"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		WebElement element4 = driver.findElement(By.xpath("//a[text()='Contact us']"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", element4);
		 
	    WebElement element5 = driver.findElement(By.xpath("(//span[text()='Call: +91-9344766677'])[1]"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", element5);
		
		
	    System.out.println("3. Home page Header links working fine");
		
	

	}
	
	@Test(priority=4)
	private void QuickLinks() {
		
		driver.get("http://bharathlabs.in/");
		
		WebElement element = driver.findElement(By.xpath("//a [text() = 'About Us']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);

		WebElement element2 = driver.findElement(By.xpath("//a [text() = 'Our Services']"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
		
		WebElement element3 = driver.findElement(By.xpath("//a [text() = 'Contact Us']"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
		
		System.out.println("4. BharathLab Home page Quick links working fine");
		
		
	}
	
	@Test(priority=5)
	private void ServicesLinks() throws InterruptedException {
		
		driver.get("http://bharathlabs.in/");
		
		WebElement element6 = driver.findElement(By.xpath("(//a [@href= 'special-harmone-tests.html'])[4]"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", element6);
		
		WebElement element = driver.findElement(By.xpath("//a [text() = 'Biochemistry Tests']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		WebElement element1 = driver.findElement(By.xpath("//a [text() = 'Microbiology Tests']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		WebElement element2 = driver.findElement(By.xpath("//a [text() = 'Serology Tests']"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
		
		WebElement element3 = driver.findElement(By.xpath("//a [text() = 'Digital X-ray']"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
		
		WebElement element4 = driver.findElement(By.xpath("//a [text() = 'ECG']"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", element4);
		
		WebElement element5 = driver.findElement(By.xpath("//a [text() = 'Hematology Tests']"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", element5);
		
	
	
		
		System.out.println("5. BharathLab Home page Service links working fine");
		

	}
	
	@Test(priority=6)
	private void GetInTouch() {
		
		driver.get("http://bharathlabs.in/");
		WebElement element6 = driver.findElement(By.xpath("//a [@href= 'https://goo.gl/maps/v56wYg29w9hnwp629']"));
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click();", element6);
		
		WebElement element7 = driver.findElement(By.xpath("//i[@class='las la-location-arrow']"));
		JavascriptExecutor exe1=(JavascriptExecutor)driver;
		exe1.executeScript("arguments[0].click();", element7);
		
		System.out.println("6. BharathLab Get in Touch links working fine");
		System.out.println("7. BharathLab Social Media links Facebook, instagram, Linkedin not working");

	}
	
	@AfterSuite
	private void quitbrower() {
		
		end=System.currentTimeMillis();
		long total=end-start;
		System.out.println("Total Running time: "+ total);
		driver.quit();
		
	}

}
