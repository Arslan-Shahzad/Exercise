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
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	element = driver.findElement(By.xpath("//*[@title='loveholidays Home']"));
    	wait.until(ExpectedConditions.visibilityOf(element));
    	return element;
    }
    
    public static void Wait_For_Display(WebDriver driver){
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("return-to-offer-small__content")));
    	wait.until(ExpectedConditions.elementToBeClickable(By.className(hotelNameClass)));
        
    }
    
    
    public static WebElement offer_root(WebDriver driver){
    	
    	element = driver.findElement(By.xpath("//div[@id = 'root']"));
    	return element;
    }
    
    public static WebElement offer_hotel(WebDriver driver){
    	
    	element = HomePage.offer_root(driver).findElement(By.xpath("//a[contains(@class, 'return-to-offer-large__details__name')]"));
    	return element;
    }
    
    public static WebElement offer_dest(WebDriver driver){
    	
    	element = HomePage.offer_root(driver).findElement(By.tagName("h2"));
    	return element;
    }
    
    public static String return_hotel_destination(WebDriver driver){
    	 
    	return HomePage.offer_dest(driver).getText();
    	
    }
    
    public static String return_hotel_name(WebDriver driver){
   	 
    	return HomePage.offer_hotel(driver).getText();
    	
    }
    
}