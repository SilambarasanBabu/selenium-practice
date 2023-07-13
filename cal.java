package into;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.name("form_fields[travel_comp_date]")).click();
		List<WebElement> date = driver.findElements(By.className("flatpickr-day "));
		int count = driver.findElements(By.className("flatpickr-day ")).size();
		
		int i;
		for (i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			if(text.equalsIgnoreCase("28"))
			{
				driver.findElements(By.className("flatpickr-day ")).get(i).click();
				break;
			}
		}
		
		

	}

}
