import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/rustamovfamily/Documents/chromedriver");
        WebDriver wd=new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get(" https://www.techlistic.com/p/selenium-practice-form.html");
wd.findElement(By.name("firstname")).sendKeys("Liliana"+ Keys.TAB+"Miliana");
wd.findElement(By.id("sex-1")).click();
wd.findElement(By.id("exp-6")).click();
wd.findElement(By.id("datepicker")).sendKeys("03/22/1986");
wd.findElement(By.id("profession-0")).click();
wd.findElement(By.id("profession-1")).click();
wd.findElement(By.id("tool-2")).click();
Select slt=new Select(wd.findElement(By.id("continents")));
slt.selectByVisibleText("South America");
Select slt2=new Select(wd.findElement(By.id("selenium_commands")));
slt.getAllSelectedOptions();


    }
}
