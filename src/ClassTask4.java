import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClassTask4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rustamovfamily/Documents/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.bloomberg.com/markets/stocks");
        List<WebElement> actualheader = wd.findElements(By.xpath("//div[@data-view-uid='1|0_3_3']//th[@class='data-table-headers-cell']"));
        List<String> expectedcolumn = Arrays.asList("NAME", "VALUE", "NET CHANGE", "% CHANGE", "1 MONTH", "1 YEAR", "TIME (EDT)");
        for (int i = 0; i < actualheader.size(); i++) {
            Assert.assertEquals(actualheader.get(i).getText().toUpperCase(), expectedcolumn.get(i));

        }
        //List<WebElement> actualheader2 = wd.findElements(By.xpath("List<WebElement> actualheader=wd.findElements(By.xpath"));
        //List<String> expectedcolumn2 = Arrays.asList("DOW JONES INDUS. AVG", "S&P 500 INDEX", "NASDAQ COMPOSITE", "NYSE COMPOSITE INDEX", "S&P/TSX COMPOSITE INDEX");
       // for (int i = 0; i < actualheader.size(); i++) {
         //   Assert.assertEquals(actualheader2.get(i).getText().toUpperCase(), expectedcolumn2.get(i));
        //}
    }

}