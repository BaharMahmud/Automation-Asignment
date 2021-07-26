import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class ClassTask5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rustamovfamily/Documents/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.dice.com/");
        wd.findElement(By.id("typeaheadInput")).sendKeys("SDET");

        wd.findElement(By.id("google-location-search")).sendKeys("Washington DC");
        wd.findElement(By.id("submitSearch-button")).click();
        // wd.findElement(By.id("043881b1fcbf56dc12203ba27b887a56")).click();
        //        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='card-title-link bold']")));

        List<WebElement> links = wd.findElements(By.xpath("//a[@class='card-title-link bold']"));

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < links.size(); i++) {

            links = wd.findElements(By.xpath("//a[@class='card-title-link bold']"));

            if (links.size() == 0) {
                break;
            }
            links.get(i).click();

            String text = wd.findElement(By.xpath("//div[@id='jobdescSec' and @class='highlight-black'] ")).getText();

            String[] split = text.split("[ .,()=-]");

            for (String s : split) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    int value = map.get(s);
                    value++;
                    map.put(s, value);
                }
            }
                wd.navigate().back();
                wd.navigate().refresh();
                i--;

            }


            // The most common case is when you store a webelement on one page, and navigate to another page and come back to the same page again and try to use
            // the element

            //The most frequent cause of this is that page that the element was part of has been refreshed, or the user has
            //navigated away to another page.

            System.out.println(map);

        }


    }

