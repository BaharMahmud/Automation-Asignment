import com.github.javafaker.Faker;
import javafx.scene.control.RadioButton;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Assignment4 {
    public static <Radio> void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rustamovfamily/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.get("https://www.carmax.com/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1750)");
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.findElement(By.xpath("//div[@class='initialization-form kmx-card']//div[@class='tabBar tab-bar-container']//button[@class='tab-container last']")).click();
        driver.findElement(By.id("ico-form-vin")).sendKeys("4T1BE46K67U162207" + Keys.TAB);
        driver.findElement(By.id("ico-form-zipcode")).sendKeys("22182");
        driver.findElement(By.xpath("//div[@class='initialization-form kmx-card']//button[@class='submit-button kmx-button--primary kmx-button']")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='FeaturesBody-module__styleWrapper--1Bfpq']//div[1]//div[@class='kmx-radio']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Mileage and condition']")));
        Thread.sleep(3);
        Select slt = new Select(driver.findElement(By.id("select-ico-features-drive")));
        slt.selectByValue("4WD/AWD");


        List<WebElement> lists = driver.findElements(By.xpath("//div[@class='kmx-checkbox']//input[@type='checkbox']"));

        for (WebElement list : lists
        ) {
            if (!list.isSelected())

                jse.executeScript("arguments[0].click()", list);

        }
   driver.manage().window().maximize();
        jse.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[.='Mileage and condition']")));
    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@class='kmx-text-field mdc-text-field mdc-text-field--invalid icon-right']//input[@class='kmx-text-field__input mdc-text-field__input']")))).sendKeys("60,000");


            driver.findElement(By.xpath("(//input[@value='1'])[2]")).click();
        driver.findElement(By.xpath("(//input[@value='1'])[4]")).click();
        driver.findElement(By.xpath("(//input[@value='1'])[6]")).click();
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[8]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[10]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[12]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//div[@class='kmx-checkbox']//input[@type='checkbox'])[13]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//div[@class='kmx-checkbox']//input[@type='checkbox'])[14]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[15]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[17]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[19]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[21]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[23]")));
        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//input[@value='1'])[25]")));


            List<WebElement> actualInfoList=driver.findElements(By.xpath("//div[@class='kmx-ico-vehicle-profile-summary VehicleProfileSummary-module__container--2zCKw VehicleProfileSummary-module__fullView--1emAD']//div[@class='kmx-ico-vehicle-info VehicleProfileSummary-module__vehicleInfo--tAwir']//table[@class='kmx-table']//tbody//tr//td//p"));
        List<String> expectedInfoList=Arrays.asList("Year, Make, and Model","2007 Toyota Camry","Drive", "2WD","Transmission", "Automatic","VIN","4T1BE46K67U162207","Mileage", "60,000");
        for (int i = 0; i <10 ; i++) {
            System.out.println(actualInfoList.get(i).getText());
           // Assert.assertEquals(actualInfoList.get(i).getText(),expectedInfoList.get(i));
        }



        jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@id='ico-continue-button']")));

    //Assert.assertEquals(driver.findElement(By.xpath("//div[@class='kmx-ico-offer-offerinfo Offer-module__offerInfo--26dFt']//h1")).getText(),"$5,300*");
driver.findElement(By.xpath("//button[@id='ico-set-my-appointment']")).click();
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='kmx-typography--display-1'][2]")));
//Select slt3= new Select(driver.findElement(By.id("select-ssitPw2d")));
//slt3.selectByIndex((int)(Math.random()*18));
       String parent= driver.getWindowHandle();
       Set<String> s= driver.getWindowHandles();
        Iterator<String>I=s.iterator();
       while(I.hasNext()){
           String child=I.next();
           if(!parent.equals(child)){
               driver.switchTo().window(child);
           }
       }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@CLASS='mdc-select kmx-select']//select[@class='mdc-select__native-control']")));
           jse.executeScript("arguments[0]",driver.findElement(By.xpath("//DIV[@CLASS='mdc-select kmx-select']//select[@class='mdc-select__native-control']")));
        List<WebElement> locationsList=driver.findElements(By.xpath("//DIV[@CLASS='mdc-select kmx-select']//select[@class='mdc-select__native-control']//option"));
        locationsList.get((int)(Math.random()*17)).click();
       driver.findElement(By.xpath("//div[@class='kmx-text-field mdc-text-field mdc-text-field--upgraded']//input[@id='react-datepicker']")).click();
        driver.findElement(By.xpath("//div[@class='react-datepicker__week']//div[@class='react-datepicker__day react-datepicker__day--026 react-datepicker__day--today']")).click();
     driver.findElement(By.xpath("//div[@class='kmx-text-field mdc-text-field mdc-text-field--upgraded']//input[@id='react-timepicker']")).click();
     driver.findElement(By.xpath("(//ul[@class='react-datepicker__time-list']//li[@class='react-datepicker__time-list-item '])[1]")).click();
     driver.findElement(By.xpath("//form[@id='store-appointment-form']//button[@tabindex='0']")).click();
     driver.findElement(By.linkText("Privacy Policy")).click();
     String parent2=driver.getWindowHandle();
     Set<String> s1= driver.getWindowHandles();
     Iterator<String>I2=s1.iterator();
        while (I2.hasNext()) {
            String child2=I2.next();
            if(!parent2.equals(child2)){
                driver.switchTo().window(child2);
            }
        }
     String expectedTitle="Privacy Policy | CarMax";

     String actaluTitle=driver.getTitle();

     Assert.assertEquals(actaluTitle,expectedTitle);


     driver.switchTo().window(parent);
     driver.findElement(By.xpath("//div[@id='kmx-ico-offer-appointment']//button[@class='Offer-module__emailButton--3jF1f kmx-button kmx-button--tertiary']")).click();

Faker faker=new Faker();
driver.findElement(By.xpath("//div[@class='kmx-text-field mdc-text-field mdc-text-field--invalid icon-right']//input[@autocapitalize='none']")).sendKeys(faker.internet().emailAddress());
driver.findElement(By.xpath("//div[@class='Offer-module__form--2ZwjK']//button[@class='kmx-button kmx-button--primary']")).click();
driver.quit();


}


}




