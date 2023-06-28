package into;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assigment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("silambarasan");
		driver.findElement(By.name("email")).sendKeys("simbusivasj73@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("@babusr123");
		WebElement staticdropdown =driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("01012001");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		
		

	}

}
