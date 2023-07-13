package into;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\SysSoft\\Desktop\\seleniem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Silambarasan");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("signInBtn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        driver.findElement(By.className("logout-btn")).click();
        driver.close();
	}
        public static String getPassword(WebDriver driver) throws InterruptedException
        

{ 
        	driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.linkText("Forgot your password?")).click();
            Thread.sleep(2000);
            driver.findElement(By.className("reset-pwd-btn")).click();
            String passwordText =driver.findElement(By.cssSelector("from p")).getText();
            String[] passwordArray =passwordText.split("'");
            String password = passwordArray[1].split("'")[0];
            return password;
}
}
