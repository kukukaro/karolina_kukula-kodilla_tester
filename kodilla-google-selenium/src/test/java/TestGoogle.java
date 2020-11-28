import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.ResultPage;

public class TestGoogle {
    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");

        //close popup
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(webDriver -> driver.switchTo().frame(0));

        WebElement agree = driver.findElement(By.id("introAgreeButton"));
        agree.click();
    }

    @After
    public void tearDown() {
        driver.close();                   // [1]
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void homework() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleResults results = googleSearch.searchResults();
        ResultPage result = results.loadRandomResultPage();
        Assert.assertEquals(result.getPageAddress(), driver.getCurrentUrl());
    }
}
