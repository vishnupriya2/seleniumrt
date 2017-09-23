package Testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DecideBrowser {
WebDriver driver;
@BeforeSuite
@Parameters( "browser" )
public void lauchbrowser(String browserdecided){
	if(browserdecided.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","D://priya//chromedriver.exe");
		 driver=new ChromeDriver();
	
}
	else if(browserdecided.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver","D://priya//geckodriver.exe");
		driver=new FirefoxDriver();  
	}
}
	@Test
	public void openGoogle(){
		driver.get("http://www.google.com");
	

}

}


