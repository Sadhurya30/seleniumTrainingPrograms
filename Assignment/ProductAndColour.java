package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProductAndColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//div[@aria-label='iphone 15 128gb']")).click();
		
		WebElement phoneName = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']"));
		System.out.println("Name of the phone " + phoneName.getText());
		//WebElement a =driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']/ancestor::div[@data-cy='title-recipe']//following-sibling::div[@class='puisg-row']//div[@class='puisg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//div[@class='a-section s-color-swatch-container s-quick-view-text-align-start']"));
		
		System.out.println("The available colors of the phone are");
		List<WebElement> colours =driver.findElements(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']//ancestor::div[@data-cy='title-recipe']//following-sibling::div[@class='puisg-row']//div[@class='a-section s-color-swatch-container s-quick-view-text-align-start']//div//div//a"));
		//List<WebElement> colours =driver.findElements(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']//ancestor::div[@data-cy='title-recipe']//following-sibling::div[@class='puisg-row']//div[@class='a-section s-color-swatch-container s-quick-view-text-align-start']//div//div//a//span[@class='s-color-swatch-inner-circle-fill']"));
		for(WebElement ele : colours)
		{
			String colorvalue = ele.getAttribute("aria-label");
			System.out.println(colorvalue);
		}
		
		driver.close();
	}

}
