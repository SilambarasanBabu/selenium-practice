package into;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sell {

	public static void main(String[] args) {
		
		//System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("Webdriver.gecko.driver", "C:/Users/SysSoft/Desktop/seleniem/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://myenglishfriend.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
