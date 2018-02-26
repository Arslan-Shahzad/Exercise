package Selenium.Exercise.pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Actions {

	    
	    public static void Wait_For_Display_and_close(WebDriver driver){
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	    	try{
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("notifications-layout__inner")));
	    	driver.findElement(By.className("notifications-layout__close")).click();
	    	}catch (Exception e){
	    		
	    	}   
	    }
	    
	    public static void switch_tabs(WebDriver driver){
	    	Set<String> tab_handles = driver.getWindowHandles();
	        int number_of_tabs = tab_handles.size();
	        int new_tab_index = number_of_tabs-1;
	        driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
	    }
}