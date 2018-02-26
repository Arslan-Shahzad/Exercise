package Selenium.Exercise.pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
    private static WebElement element = null;
    private static String hotelNameClass = "book-basket__hotel-details__name";
    private static String hotelLocationClass = "book-basket__hotel-details__destination";
    
    public static void Wait_For_Display(WebDriver driver){
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className(hotelNameClass)));
    	wait.until(ExpectedConditions.visibilityOf(LandingPage.dest_Name(driver)));
        
    }

    public static WebElement hotel_Name(WebDriver driver){

        element = driver.findElement(By.className(hotelNameClass));
        return element;

    }

    public static WebElement dest_Name(WebDriver driver){

    	element = driver.findElement(By.className(hotelLocationClass));
    	return element;

    }

}