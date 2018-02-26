package Selenium.Exercise.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class handleNotification {

	    
	    public static void Wait_For_Display_and_close(WebDriver driver){
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	    	try{
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("notifications-layout__inner")));
	    	driver.findElement(By.className("notifications-layout__close")).click();
	    	}catch (Exception e){
	    		
	    	}   
	    }

	  

}


