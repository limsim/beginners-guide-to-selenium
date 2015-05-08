package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {
    @Test
    public void enterSearch() {
//        Create a driver for the browser so you can automate actions
        FirefoxDriver driver = new FirefoxDriver();


//        Go to URL
        driver.get("http://www.seleniumhq.org/");

//        Find element by ID
        WebElement searchBox = driver.findElement(By.id("q"));

//        Enter text in text box
        searchBox.sendKeys("example");

//        Find element using class name
        WebElement sponsors = driver.findElement(By.className("selenium-sponsors"));

//        Find element by css selector
        WebElement documentationLink = driver.findElement(By.cssSelector("#menu_documentation>a"));
        documentationLink.click();

//        Find element by XPath
        WebElement element = driver.findElement(By.xpath(".//*[@id='selenium-documentation']/div[1]/ul/li[2]/ul/li[1]/a"));
        element.click();

//        End session and close browser
        driver.quit();
    }
}
