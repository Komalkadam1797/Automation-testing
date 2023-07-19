package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Test_Script {
	@Test
	public void login() throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://www.amazon.in/");
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	d.findElement(By.id("nav-search-submit-button")).click();
	d.findElement(By.xpath("(//span[.='Apple iPhone 14 (128 GB) - Blue'])[1]")).click();  
	 d.findElement(By.id("add-to-cart-button")).click();

	d.close();
	}

}
