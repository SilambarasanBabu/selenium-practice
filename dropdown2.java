package into;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//To count check box
		System.out.print(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")));
		//int i=1;
		/*while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}*/
		int i;
		for(i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
			
		
		driver.findElement(By.id("btnclosepaxoption")).click();	
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult" );
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
