package into;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class generic {


	public static  void main( ) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait (driver, 5);
	    String[] items= {"Cucumber","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	
		
		
		
		
	}
 
	
	public static void addItems(WebDriver driver, String[] items) 
	{
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	int i;
	int j=0;
	for (i = 1; i < products.size(); i++) {
		String[] name = products.get(i).getText().split("-");
		String formatename =name[0].trim(); 
	
		List itemlist = Arrays.asList(items);
		
		
		if (itemlist.contains(formatename))
		{
			j++;
			driver.findElements(By.cssSelector("div[class=product-action] button")).get(i).click();
		    if(j==items.length)
		    {
		    	break;
		    }
		}
	}

	}
	}
