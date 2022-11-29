package Sites;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ideablitztech {
	
	String Homepage="https://ideablitztech.com/";
	String Homepagelogo="https://ideablitztech.com/index.html";
	String Whatsapplink="https://api.whatsapp.com/send?phone=918883073999&text=Hi+Ideablitz&lang=en";
	String Fackbooklink="https://www.facebook.com/Ideablitz-Technologies-101074401897428";
	String Instagramlink="https://www.instagram.com/ideablitztechnologies/?utm_medium=copy_link";
	String LinkedIn="https://in.linkedin.com/company/ideablitz-technologies?trk=public_profile_experience-group-header&original_referer=https%3A%2F%2Fideablitztech.com%2F";
	
	static WebDriver driver;
	long start;
	long end;
	
	@BeforeSuite
	private void Openchrome() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		
		driver=new ChromeDriver();
		start=System.currentTimeMillis();
		driver.manage().window().maximize();
		
		
	}
	
	@Test(priority=0)
	private void HomePageUrl() {
		// TODO Auto-generated method stub
	    driver.get("http://ideablitztech.com/");
		String homepage=driver.getCurrentUrl();
		if(homepage.equals(Homepage))
		{
			System.out.println("1. Ideablitztech HomePage link is working fine");
		}
		else
		{
			System.out.println("1. IdeablitztechHomePage link is not working");
		}
		

	}
	
	
	@Test(priority=1)
	private void HomePageLogoLink() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("http://ideablitztech.com/");
		WebElement click=driver.findElement(By.xpath("//img[@src='img/ideablitz-logo.png']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", click);
		
		String homepagelogo=driver.getCurrentUrl();
		if(homepagelogo.equals(Homepagelogo))
		{
			System.out.println("2. Ideablitztech HomePageLogo link is working fine");
		}
		else
		{
			System.out.println("2. Ideablitztech HomePageLogo link is not working");
		}
		
		

	}
	
	@Test(priority=2)
	private void HomePageSideLinks() throws InterruptedException
	{
		driver.get("https://ideablitztech.com/");
		
		WebElement home= driver.findElement(By.xpath("//a[@href='#home']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",home);
		
		WebElement about=driver.findElement(By.xpath("//a[@href='#about']"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",about);
		
		WebElement service=driver.findElement(By.xpath("//a[@href='#service']"));
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();",service);
		
		WebElement team=driver.findElement(By.xpath("//a[@href='#team']"));
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].click();",team);
		
		WebElement contact=driver.findElement(By.xpath("//a[@href='#contact']"));
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",contact);
		
		System.out.println("3. Ideablitztech HOME, ABOUT, SERVICE, TEAM, CONTACT button clicked successfully");
		
		
	}
	
	
	@Test(priority=3)
	private void Whatsapplink() throws InterruptedException {
		driver.get("https://ideablitztech.com/");
		
		String oldwindow=driver.getWindowHandle();
		
		WebElement whatup=driver.findElement(By.xpath("//a[@onclick='openWhatsapp()']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",whatup);
		
		Set<String>hanldes=driver.getWindowHandles();
		
		for (String newwindow : hanldes) {
			
			driver.switchTo().window(newwindow);
			
		}
		
		String what=driver.getCurrentUrl();
		
		if(what.equals(Whatsapplink)) {
			System.out.println("4. Ideablitztech Whaptup link working succesfully");
		}
		else
		{
			System.out.println("4. Ideablitztech Whaptup link working not successfully");
		}
		driver.close();
		driver.switchTo().window(oldwindow);
	

	}
	
	
	
		
	

	@Test(priority=4)
	private void Formchecking() throws InterruptedException {
		// TODO Auto-generated method stub
		
	    driver.get("https://ideablitztech.com/");
		WebElement name=driver.findElement(By.id("contact_name"));
		name.sendKeys("Suryaprakash");
		
		WebElement email=driver.findElement(By.id("contact_email"));
		email.sendKeys("surya@gmail.com");
		
		WebElement phone=driver.findElement(By.id("contact_phone"));
		phone.sendKeys("8802859698");
		
		WebElement website=driver.findElement(By.id("contact_website"));
		website.sendKeys("ideabliztech.com");
		
		WebElement message=driver.findElement(By.id("contact_message"));
	    message.sendKeys("Hi team goodmoring");
	
	    
	    WebElement submit=driver.findElement(By.id("contact_submit"));
	    boolean sub1=submit.isEnabled();
	    if(sub1=true) {
	    	System.out.println("5. Iteablitztech Form field working fine & Submit filed enable");
	    }
	    else
	    {
	    	System.out.println("5. Iteablitztech Form field not working  & Submit filed not enable");
	    }
	    
		
		

		
		
	}
	
	
	
	@Test (priority=5)
	private void Facebook() throws InterruptedException {
		
		
		driver.get("http://ideablitztech.com/");
		
		String oldwindow=driver.getWindowHandle();
		WebElement face=driver.findElement(By.xpath("(//*[contains(@class,'fab')])[2]"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",face);
		
		
		Set<String>han=driver.getWindowHandles();
		for(String Newwindow:han) {
			driver.switchTo().window(Newwindow);
		}
		String Fblink2=driver.getCurrentUrl();
		
		if(Fblink2.equals(Fackbooklink)) {
			System.out.println("6. Ideablitztech FaceBook link working successfully");
		}
		else
		{
			System.out.println("6. Ideablitztech FaceBook link working Not successfully");
		}
		driver.close();
		driver.switchTo().window(oldwindow);
	
		
	
	}
	
	
	@Test (priority=6)
	private void Instagram() throws InterruptedException {
		// TODO Auto-generated method stub
		
        driver.get("http://ideablitztech.com/");
		
		
		String old=driver.getWindowHandle();
		WebElement insta=driver.findElement(By.xpath("//*[contains(@class,'fab fa-instagram')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", insta);
		
		Set<String>han=driver.getWindowHandles();
		for(String Newwindow:han) {
			driver.switchTo().window(Newwindow);
		}
		String insta1=driver.getCurrentUrl();
		
		
		if(insta1.equals(Instagramlink)) {
			System.out.println("7. Ideablitztech Instagram link working successfully");
		}
		else
		{
			System.out.println("7. Ideablitztech Instagram link not working successfully");
		}
		driver.close();
		driver.switchTo().window(old);
				

	}
	
	
	@Test (priority=7)
	private void LinkedIn() throws InterruptedException {
		// TODO Auto-generated method stub
		
       driver.get("http://ideablitztech.com/");
        String old=driver.getWindowHandle();
        
       WebElement linked= driver.findElement(By.xpath("//*[contains(@class,'fab fa-linkedin-in')]"));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].click()", linked);
       
       Set<String>newwindow=driver.getWindowHandles();
       for (String new1 : newwindow) {
    	   
    	   driver.switchTo().window(new1);
		
       }
		String linkedin=driver.getCurrentUrl();
		
		
		if(linkedin.equals(LinkedIn)){
			System.out.println("8. Ideablitztech LinkedIn link working successfully");
		}
		else
		{
			System.out.println("8. Ideablitztech LinkedIn link not working successfully");
		}
			
		driver.close();
		driver.switchTo().window(old);
		
		
		

	}
	
	@AfterSuite
	private void time() {
		
		end=System.currentTimeMillis();
		long total=end-start;
		System.out.println("Total running time: " + total);
		driver.quit();
		
		

	}

}
