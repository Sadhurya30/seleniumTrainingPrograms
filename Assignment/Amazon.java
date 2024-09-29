package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		//driver.findElement(By.xpath("//div[@class='s-suggestion-container']//div[@aria-label='puma shoes for man']")).click();
		driver.findElement(By.xpath("//div[@class='two-pane-results-container']//div[@class='left-pane-results-container']"
				+ "//div//div[@class='s-suggestion-container']/div[@class='s-suggestion s-suggestion-ellipsis-direction' and "
				+ "@aria-label='puma shoes for man']")).click();
		
		List<WebElement> price =driver.findElements(By.xpath("//span[text()='Puma']//ancestor::div[@data-cy='title-recipe']/following-sibling::div[@data-cy='price-recipe']//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']"));
		
		/*
		 * for(WebElement ele:price) { System.out.println(ele.getText()); }
		 */
		
		
		List<WebElement> name = driver.findElements(By.xpath("//span[text()='Puma']//ancestor::div[@data-cy='title-recipe']//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		/*
		 * for(WebElement ele: name) { System.out.println(ele.getText()); }
		 */
		System.out.println("count of shoesname" + name.size());
		System.out.println("count of Shoesprice" + price.size());
		
		for(int i=0;i<name.size()-1;i++)
		{
			String priceShoe = price.get(i).getText().replaceAll(",","");
			int priceOfShoe = Integer.parseInt(priceShoe);
			if(priceOfShoe>=2000)
			{
				System.out.println(name.get(i).getText() + ":" + priceOfShoe);
			}
		}
		driver.close();
	}
		
}


