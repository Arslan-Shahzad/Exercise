package testCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Selenium.Exercise.pageObjects.HomePage;
import Selenium.Exercise.pageObjects.OfferSummaryPage;
import Selenium.Exercise.pageObjects.handleNotification;

public class firstTestCase {

    private static WebDriver driver = null;

    @Test
    public void scenario_to_Test() {
    	
    	String web_url = ("https://www.loveholidays.com/book/flight-and-hotel/offer-" +
    		"summary.html?shortref=LA9YVPJH&state=AwoUKFAAIKSCaCeCjLYYEIABgHA");
    	
        String exePath = "resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();

        driver.get(web_url);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        OfferSummaryPage.Wait_For_Display(driver);
        String offerhotel = OfferSummaryPage.return_hotel_name(driver);
        String offerdest = OfferSummaryPage.return_hotel_destination(driver);

        wait.until(ExpectedConditions.elementToBeClickable(HomePage.home_Button(driver)));
        handleNotification.Wait_For_Display_and_close(driver);
        HomePage.home_Button(driver).click();
        
        // I was not able to resolve 'element not found Error'
        // I completed the code as i believe it would work.
       
        wait.until(ExpectedConditions.stalenessOf(HomePage.offer_hotel(driver)));
        
        Assert.assertEquals(offerdest, HomePage.return_hotel_destination(driver));
        Assert.assertEquals(offerhotel, HomePage.return_hotel_name(driver));
        
        HomePage.offer_hotel(driver).click();
        
        Assert.assertEquals(web_url, driver.getCurrentUrl());
        driver.quit();

    }

}
