package PROGRAMS;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PROGRAMS_1 {
	
	@Test
	public void method1() throws InterruptedException
	{
		
	// WebDriver driver=new ChromeDriver();  
	//WebDriver driver = new FirefoxDriver();  
	WebDriver driver = new EdgeDriver();
	
     // Launch Website  
    driver.navigate().to("https://www.google.com/");  
  Thread.sleep(3000);
   //Maximize the browser  
    driver.manage().window().maximize();  
    
  
 
    

	

   

}  


}
