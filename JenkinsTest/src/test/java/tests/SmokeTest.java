package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTest {

	 protected WebDriver driver;
	 
    @Test
    public void verifyGoogleTitle() {
    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
		
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("test"), "Title mismatch");
		Assert.assetTrue(title.contains("Google"),"Title mismatch");
        driver.quit();
    }
}





