import javafx.scene.control.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class ReplitAssignment3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rustamovfamily/Documents/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.carfax.com/");
        wd.findElement(By.xpath("//a[@href='/cars-for-sale']")).click();
        String actual = "Used Cars";
        String HtmlCode = wd.getPageSource();
        Assert.assertTrue(HtmlCode.contains(actual));
        wd.findElement(By.xpath("//select[@class='form-control search-make search-make--lp']")).click();

        List<WebElement> allOptions = wd.findElements(By.xpath("//select[@class='form-control search-make search-make--lp']/optgroup[@class='popular-makes']/*"));
        System.out.println(allOptions.size());

        for (int i = 0; i <= allOptions.size() - 1; i++) {


            if (allOptions.get(i).getText().contains("Tesla")) {

                allOptions.get(i).click();
            }

        }
        wd.switchTo().activeElement().click();
        wd.findElement(By.xpath("//div[@class='form-field-wrapper']/select[@class='form-control search-model  search-model--lp']")).click();
        List<WebElement> allOPtions2 = wd.findElements(By.xpath("//optgroup[@class='current-models']/option"));
        List<String> expected = Arrays.asList("Model 3", "Model S", "Model X", "Model Y");
        String expected2;
        {
            for (int j = 0; j < allOPtions2.size() - 1; j++) {
                if (allOPtions2.get(j).getText().contains(expected.get(j))) {
                    wd.findElement(By.id("model_Model-S")).click();


                }

            }
        }
        System.out.println(allOPtions2.size());

        wd.switchTo().activeElement().click();
        wd.findElement(By.xpath("//div[@class='zip-container']/input[@type='tel']")).sendKeys("22033");
        wd.findElement(By.id("make-model-form-submit")).click();


        String actual2 = "Step 2 - Show me cars with";
        String HtmlCode2 = wd.getPageSource();
        Assert.assertTrue(HtmlCode.contains(actual));
        List<WebElement> options = wd.findElements(By.xpath("//ul[@class='checkbox-list checkbox-list--left checkbox-list--large list-unstyled']/*"));
        for (int k = 0; k < options.size(); k++) {
            options.get(k).click();

        }


        System.out.println(wd.findElement(By.xpath("//span[@class='totalRecordsText']")).getText());
        wd.findElement(By.xpath("//span[@class='totalRecordsText']")).click();

        List<WebElement> carList = wd.findElements(By.xpath("//h4[@class='srp-list-item-basic-info-model']"));
        String actualCarNumCheck = "" + carList.size() + " " + "results";
        Assert.assertEquals(actualCarNumCheck, wd.findElement(By.id("totalResultCount")).getText());
        for (int n = 0; n < carList.size(); n++) {
            Assert.assertTrue(carList.get(n).getText().contains("Tesla Model S"));

        }
        List<WebElement> priceList = wd.findElements(By.xpath("//span[@class='srp-list-item-price']"));
        for (int m = 0; m < priceList.size() - 1; m++) {
            System.out.println(priceList.get(m).getText());

        }

        wd.findElements(By.xpath("//div[@class='srp-header-sort-form-group']/select[@class='srp-header-sort-select srp-header-sort-select-desktop--srp']/*")).get(1).click();

        wd.findElements(By.xpath("//div[@class='srp-header-sort-form-group']/select[@class='srp-header-sort-select srp-header-sort-select-desktop--srp']/*")).get(4).click();

        //Assert.assertEquals(wd.findElement(By.xpath("//span[@class='srp-list-item-price'][1]")).getAttribute("$79,985"),"79,985");


        wd.findElements(By.xpath("//div[@class='srp-header-sort-form-group']/select[@class='srp-header-sort-select srp-header-sort-select-desktop--srp']/*")).get(5).click();}
}