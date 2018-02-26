package Selenium.Exercise.pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferSummaryPage {
    private static WebElement element = null;
    private static String hotelNameClass = "book-basket__hotel-details__name";
    private static String hotelLocationClass = "book-basket__hotel-details__destination";
    
    public static void Wait_For_Display(WebDriver driver){
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className(hotelNameClass)));
    	wait.until(ExpectedConditions.visibilityOf(OfferSummaryPage.dest_Name(driver)));
        
    }

    public static WebElement hotel_Name(WebDriver driver){

        element = driver.findElement(By.className(hotelNameClass));
        return element;

    }

    public static WebElement dest_Name(WebDriver driver){

    	element = driver.findElement(By.className(hotelLocationClass));
    	return element;

    }

    public static String return_hotel_destination(WebDriver driver){
   	 
    	return OfferSummaryPage.dest_Name(driver).getText();
    	
    }
    
    public static String return_hotel_name(WebDriver driver){
   	 
    	return OfferSummaryPage.hotel_Name(driver).getText();
    	
    }
}