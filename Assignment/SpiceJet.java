package Assignment;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver =  new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		
		driver.findElement(By.xpath("//input[@autocapitalize=\"sentences\" and @autocomplete=\"on\"]")).sendKeys("MAA");
		//driver.findElement(By.xpath("//input[@value=\"Select Destination\"]")).sendKeys("BLR");
		
		//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input[@autocapitalize='sentences'])[2]")).click();
		
		
		  driver.findElement(By.xpath("(//input[@autocapitalize=\"sentences\" and @autocomplete=\"on\" and" +
		  " @class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys
		 ("BKK");
		
		 
		//driver.findElement(By.xpath("\"//div[text()='Departure Date']\")")).click();
		driver.findElement(By.xpath("//div[text()='30']")).click();
		driver.findElement(By.xpath("//div[.='31']")).click();
		
	    driver.findElement(By.xpath("//div[text()='Passengers']")).click();
	    driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	    driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
	    
	    Actions act = new Actions(driver);
	    act.click().perform();
	    //driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
	    driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
		driver.close();
		
	}

}
