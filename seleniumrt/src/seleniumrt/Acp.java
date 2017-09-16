package seleniumrt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D://priya//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
driver.manage().window().maximize();

/*ALERT
WebElement alertbutton=driver.findElement(By.name("B2"));
alertbutton.click();
Alert alert=driver.switchTo().alert();
Thread.sleep(2000);
alert.accept();*/
//COMMAND

WebElement cbutton=driver.findElement(By.name("B3"));
cbutton.click();
Alert calert=driver.switchTo().alert();
Thread.sleep(2000);
alert.accept();
Thread.sleep(1000);

alert.accept();


*/
//PROMPT
WebElement pbutton=driver.findElement(By.name("B4"));
pbutton.click();
Alert palert=driver.switchTo().alert();
palert.sendKeys("priya");
palert.accept();
System.out.println(palert.getText());
Thread.sleep(2000);
palert.accept();
/*Thread.sleep(1000);
alert.accept();


*/
}
}


		

