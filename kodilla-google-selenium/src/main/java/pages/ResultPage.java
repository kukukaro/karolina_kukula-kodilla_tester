package pages;

import org.openqa.selenium.WebDriver;

public class ResultPage extends AbstractPage {

    private final String pageAddress;

    public ResultPage(WebDriver driver, String pageAddress) {
        super(driver);
        this.pageAddress = pageAddress;
    }

    public String getPageAddress() {
        return pageAddress;
    }
}
