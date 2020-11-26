package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement closePopup = driver.findElement(By.cssSelector("button[data-role=\"close-and-accept-consent\""));
        closePopup.click();

        WebElement inputField = driver.findElement(By.cssSelector("input[type=\"search\"]"));
        inputField.sendKeys("mavic mini");
        WebElement findCategory = driver.findElement(By.cssSelector("select[aria-label=\"Kategoria i opcje wyszukiwania\"]"));


        Select selectCategory = new Select(findCategory);
        selectCategory.selectByValue("/kategoria/elektronika");


        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role=\"search-button\"][type=\"submit\"]"));
        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver,5);


        List<WebElement> articles = driver.findElements(By.cssSelector("section > article"));

        articles.stream()
                .map(a -> a.getText())
                .forEach(System.out::println);

        driver.close();
    }
}
