package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {
    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public ResultPage loadRandomResultPage() {
        int index = new Random().nextInt(results.size());
        WebElement toBeFollowed = results.get(index);
        WebElement link = toBeFollowed.findElement(By.cssSelector("a"));
        String pageAddress = link.getAttribute("href");
        toBeFollowed.click();
        return new ResultPage(driver, pageAddress);
    }
}
