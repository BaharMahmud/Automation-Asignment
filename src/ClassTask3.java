import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ClassTask3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users/rustamovfamily/Documents/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.cars.com/");


    }
}
