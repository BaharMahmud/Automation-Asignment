import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ReplitAssignment {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","/Users/rustamovfamily/Documents/chromedriver");
        WebDriver wb=new ChromeDriver();
        wb.get("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");

        String actualTitle="Welcome to Duotify!";

        String expectedTitle=wb.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        wb.findElement(By.id("hideLogin")).click();

        WebElement inputBox1=wb.findElement(By.id("username"));

        String letters="qwertyuioplkjhgfdsazxcvbnm";
        int one=(int)(Math.random()*26);
        int two=(int)(Math.random()*26);
        int three=(int)(Math.random()*26);
        int four=(int)(Math.random()*26);
        int five=(int)(Math.random()*26);
        int six=(int)(Math.random()*26);
        String username=""+letters.charAt(one)+letters.charAt(two)+letters.charAt(three)+letters.charAt(four)+letters.charAt(five)+letters.charAt(six);
        inputBox1.sendKeys(username);

        WebElement inputBox2=wb.findElement(By.id("firstname"));

        String firstname="Zazi";

        inputBox2.sendKeys(firstname);

        WebElement inputBox3=wb.findElement(By.id("lastName"));

        String lastname="Zazi";

        inputBox3.sendKeys(lastname);

        WebElement inputBox4=wb.findElement(By.id("email"));

        String email=username+"@gmail.com";

        inputBox4.sendKeys(email);

        WebElement inputBox5=wb.findElement(By.id("email2"));

        String email2=username+"@gmail.com";

        inputBox5.sendKeys(email2);

        WebElement inputBox6=wb.findElement(By.id("password"));

        String password="Pasham45";

        inputBox6.sendKeys(password);

        WebElement inputBox7=wb.findElement(By.id("password2"));

        String password2="Pasham45";

        inputBox7.sendKeys(password2);

        wb.findElement(By.name("registerButton")).click();


    String currentURL=wb.getCurrentUrl();
    Thread.sleep(3000);
    String expectedURL="http://duotifyapp.us-east-2.elasticbeanstalk.com/browse.php?";
        Thread.sleep(3000);
        Assert.assertEquals(currentURL,expectedURL);
        Thread.sleep(3000);
        String htmlCode=wb.getPageSource();
        String str=username;
        assertTrue(htmlCode.contains(str));


        wb.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(3000);
      //  assertTrue(wb.findElement(By.className("userInfo")).equals(username));
     /*String use=wb.findElement(By.className("userInfo")).toString();
    if(use.equals(username)){
        System.out.println("Pass");
    }
     Thread.sleep(3000);*/
wb.findElement(By.id("rafael")).click();
        Thread.sleep(3000);



      String currentURL2=wb.getCurrentUrl();
        Thread.sleep(3000);


       String expectedURL2="http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php";

       assertEquals(currentURL2,expectedURL2);
        wb.navigate().to("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");

        Thread.sleep(3000);

      WebElement inputBox8=wb.findElement(By.id("loginUsername"));

      inputBox8.sendKeys(username);



      WebElement inputBox9=wb.findElement(By.id("loginPassword"));


      inputBox9.sendKeys(password);

        wb.findElement(By.name("loginButton")).click();
        Thread.sleep(2000);

      String HTMLCode=wb.getPageSource();
        Thread.sleep(2000);

        assertTrue(HTMLCode.contains("You Might Also Like"));
     Thread.sleep(3000);
  wb.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(1000);

        wb.findElement(By.id("rafael")).click();
        Thread.sleep(2000);


        String currentURL3=wb.getCurrentUrl();
        Thread.sleep(2000);

        String expectedURL3="http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php";

        assertEquals(currentURL3,expectedURL3);
        wb.findElement(By.id("rafael")).click();

    }





}

