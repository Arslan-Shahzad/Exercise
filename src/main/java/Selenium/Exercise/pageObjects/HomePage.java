package Selenium.Exercise.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

	private static WebElement element = null;
	private static String hotelNameClass = "return-to-offer-small";
    
    public static WebElement home_Button(WebDriver driver){
    	WebDriverWait wait = new WebDriverWait(driver, 50);
    	element = driver.findElement(By.xpath("//*[@title='loveholidays Home']"));
    	wait.until(ExpectedConditions.visibilityOf(element));
    	return element;
    }
    
    public static void Wait_For_Display(WebDriver driver){
    	WebDriverWait wait = new WebDriverWait(driver, 50);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("return-to-offer-small__content")));
    	wait.until(ExpectedConditions.elementToBeClickable(By.className(hotelNameClass)));
        
    }
    
    
    public static WebElement offer_dest(WebDriver driver){
    	
    	element = driver.findElement(By.className("return-to-offer-small"));
    	return element;
    }
    
    public static WebElement offer_hotel(WebDriver driver){
    	
    	element = driver.findElement(By.className("return-to-offer-small__content"));
    	return element;
    }
    
    
    
    
}