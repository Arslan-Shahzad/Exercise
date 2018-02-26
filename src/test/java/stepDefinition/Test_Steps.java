package stepDefinition;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Selenium.Exercise.pageObjects.Actions;
import Selenium.Exercise.pageObjects.HomePage;
import Selenium.Exercise.pageObjects.OfferSummaryPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class Test_Steps {
	public static WebDriver driver;
		
	 @Before
	    public void setUp(){
	            String exePath = "resources/chromedriver";
	            System.setProperty("webdriver.chrome.driver", exePath);
	            driver = new ChromeDriver();
	            
	    }
	    
	    
	    @After
	    public void tearDown(){
	    	driver.quit();
	    }
	
	@Given("^The user has landed on the Offer Summary page$")
	public void The_user_has_landed_on_the_Offer_Summary_page() throws Throwable {
		String exePath = "resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
		String web_url = ("https://www.loveholidays.com/book/flight-and-hotel/offer-" +
				"summary.html?shortref=LA9YVPJH&state=AwoUKFAAIKSCaCeCjLYYEIABgHA");
		driver.get(web_url);
        OfferSummaryPage.Wait_For_Display(driver);
		}
 
	@When("^The user goes back to home page$")
	public void The_user_goes_back_to_home_page() throws Throwable {
        Actions.Wait_For_Display_and_close(driver);
        HomePage.home_Button(driver).click();
        Actions.switch_tabs(driver);
		}
 
	@Then("^The user will see the box “Still interested in a holiday to Zante\\?” box on the home page$")
	public void the_user_will_see_the_box_Still_interested_in_a_holiday_to_Zante_box_on_the_home_page() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOf(HomePage.offer_dest(driver)));
		Assert.assertEquals("Still interested in a holiday to Zante?", HomePage.return_hotel_destination(driver));
		}
 
	@When("^Clicks on Book this room$")
	public void message_displayed_Login_Successfully() throws Throwable {
		HomePage.offer_hotel(driver).click();
	}

	
	@Then("^The user is taken to the offer summary \\(same page as above\\) of the same hotel$")
		public void the_user_is_taken_to_the_offer_summary_same_page_as_above_of_the_same_hotel() throws Throwable {
		Assert.assertEquals("https://www.loveholidays.com/book/flight-and-hotel/offer-" +
				"summary.html?shortref=LA9YVPJH&state=AwoUKFAAIKSCaCeCjLYYEIABgHA", driver.getCurrentUrl());
	}
 
}