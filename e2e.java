package into;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        for(WebElement option : options)
        {
        	if(option.getText().equalsIgnoreCase("india"))
        	{
        		option.click();
        		break;
        	}
        }
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);		
	    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
        
           {
        	
        	System.out.println("its enabled");
        	Assert.assertTrue(true);
          }
           
        driver.findElement(By.id("divpaxinfo")).click();
   		Thread.sleep(2000);
   		System.out.println(driver.findElement(By.id("divpaxinfo")));
   		int i;
		for(i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown = new Select(staticDropdown);
		Dropdown.selectByIndex(3);
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        //Thread.sleep(2000);
        //driver.close();
	}

}
