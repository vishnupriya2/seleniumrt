package Testng;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Priorityexamples {
	
		@Test(priority=1)
		public void startEngine(){
			System.out.println("engine started");
		


	}
		@Test(priority=2)
		public void putFirstGear(){
			System.out.println("car in first gear");
			
		}
		@Test(priority=3)
		public void putSecondGear(){
			System.out.println("car in second gear");
		}
		@Test(priority=4)
		public void putThirdGear(){
			System.out.println("car in third gear");
		}
		
			
		

}
