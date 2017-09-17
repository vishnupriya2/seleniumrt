package Testng;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenGooogle {
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeSuite
	public  void openBrowser(){

		long starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","D://priya//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();


	}
	@Test
	public void google(){
		driver.get("http://www.google.co.in");
	}
	@Test
	public void gmail(){
		driver.get("http://www.gmail.co.in");
	}
	@Test
	public void facebook(){
		driver.get("http://www.facebook.co.in");
	}

	@AfterSuite
	public void closebrowser(){
		driver.quit();
		endtime =System.currentTimeMillis();
		totaltime = endtime - starttime;
		System.out.println(totaltime/1000.0+"seconds");
	}







}
