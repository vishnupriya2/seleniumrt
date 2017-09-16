package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
	@Test(priority=1)
	public void openGoogle(){
		System.setProperty("webdriver.chrome.driver","D://priya//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");

	}
	@Test(priority=2)
	public void openBing(){
		System.setProperty("webdriver.chrome.driver","D://priya//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bing.co.in");

	}
}

