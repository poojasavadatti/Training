package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverTest1 {

static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		//selenium IDE-out of market
		//selenium webdriver
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("IBM Training");

		//will select value from multi selections box

		Select newsLetter=new Select(driver.findElement(By.xpath("//select[@id='drop1']")));

		newsLetter.selectByIndex(2);

		//will click on radio button

		driver.findElement(By.xpath("//input[@id='radio2']")).click();

		Thread.sleep(2000);
		driver.close();
	}

}
