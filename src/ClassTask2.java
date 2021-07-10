import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClassTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rustamovfamily/Documents/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.dice.com/");
wd.findElement(By.id("typeaheadInput")).sendKeys("SDET");
wd.findElement(By.id("google-location-search")).sendKeys("22033");
    wd.findElement(By.id("submitSearch-button")).click();

        List<WebElement> links = wd.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getText());}

    }
}
