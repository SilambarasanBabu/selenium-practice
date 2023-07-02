package into;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement mini = driver.findElement(By.id("gf-BIG"));
		System.out.println(mini.findElements(By.tagName("a")).size());
		WebElement mini2 = mini.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(mini2.findElements(By.tagName("a")).size());
		int i;
		for (i=1;i<mini2.findElements(By.tagName("a")).size();i++)
		{
			String ck = Keys.chord(Keys.CONTROL,Keys.ENTER);
			mini2.findElements(By.tagName("a")).get(i).sendKeys(ck);
			Thread.sleep(5000);
			
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it =abc.iterator();
		
     while(it.hasNext())
     {
    	driver.switchTo().window(it.next());
    	System.out.println(driver.getTitle());
     }
	}

}
