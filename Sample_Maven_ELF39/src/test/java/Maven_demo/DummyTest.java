package Maven_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DummyTest{
@Test
public void dummy() {
	//System.out.println("Dummy plan");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com");
}
}
