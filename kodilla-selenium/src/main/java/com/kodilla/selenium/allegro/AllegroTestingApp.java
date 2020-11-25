package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement closePopup = driver.findElement(By.xpath("//button[contains(@data-role, \"close-and-accept-consent\")]"));
        closePopup.click();

        WebElement inputField = driver.findElement(By.xpath("//input[contains(@type, \"search\")]"));
        inputField.sendKeys("mavic mini");

        WebElement findCategory = driver.findElement(By.xpath("//select[contains(@aria-label, \"Kategoria i opcje wyszukiwania\")]"));
        Select selectCategory = new Select(findCategory);
        selectCategory.selectByIndex(3);

        driver.close();
    }
}
