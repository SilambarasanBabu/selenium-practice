package into;

import org.openqa.selenium.By
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:/Users/SysSoft/Desktop/seleniem/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown = new Select(staticDropdown);
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByVisibleText("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByValue("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		}

}
