package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingProject{ 
public static void main(String[] args) throws InterruptedException, AWTException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D://priya//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get(" http://www.demo.guru99.com/V4//");
	 driver.findElement(By.name("uid")).sendKeys("mngr98513");
	 driver.findElement(By.name("password")).sendKeys("jyhEdEp");
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	String managerid= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]")).getText();
	
	if (managerid.contains("Manger Id")) {
		System.out.println("login successful");
		
	}
	else {
		System.out.println("login not successful");
	}
}
}
