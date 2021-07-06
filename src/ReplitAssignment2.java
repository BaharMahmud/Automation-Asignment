import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.io.File;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReplitAssignment2 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/rustamovfamily/Documents/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        wd.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        wd.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        wd.findElement(By.id("ctl00_MainContent_login_button")).click();
        wd.findElement(By.xpath("//a[@href=\"Process.aspx\"]")).click();
        int random = 1 + (int) (Math.random() * 99);
        String random1 = "" + random;
        wd.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(random1);
        wd.findElement(By.className("btn_dark")).click();


        BufferedReader br = new BufferedReader(new FileReader("/Users/rustamovfamily/Documents/MOCK_DATA.csv"));
        br.readLine();

/*
String s;
String[] arr=new String[5];

List<String []>list= new ArrayList<String[]>();
        String[][] list2=new String[100][5];
   String [] line=br.readLine().split(",");
    String[] line2=new String[5];
     while((s=br.readLine())!=null){
       list.add(line);

   }
     Random r=new Random();
     int idx=r.nextInt(list.size());
     line2=list.get(idx);

        //arr=str;}
*/
        Scanner sc=new Scanner(new File("/Users/rustamovfamily/Documents/MOCK_DATA.csv"));


 String thisword=null;
        int ran=(int)(Math.random()*99);
        List<String []> list= new ArrayList<String[]>();
        //String[] line = br.readLine().split(",");
        String [] line=new String[5];
        sc.nextLine();
        while(sc.hasNextLine()){
            list.add(sc.nextLine().split(","));
        }

        line= list.get(ran);





        wd.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(line[0]+ " " + line[1]);
        wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(line[2]);
        wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(line[3]);
        wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(line[4]);
        wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(line[5]);

        /*Select slt=new Select(wd.findElement(By.id("ctl00_MainContent_fmwOrder_cardList")));

        slt.selectByIndex(number);
        */
        int number = (int) (Math.random() * 3);


        long visa = 4000000000000000L + (long) (Math.random() * 1000000000000000L);
        long master = 5000000000000000L + (long) (Math.random() * 1000000000000000L);
        long expr = 60000000000000000L + (long) (Math.random() * 10000000000000000L);

        if (number == 0) {
            wd.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"))
                    .click();
            wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("" + visa);
        } else if (number == 1) {
            wd.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"))
                    .click();
            wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("" + master);

        } else {
            wd.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2"))
                    .click();
            wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("" + expr);
        }

        wd.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("09/24");

        wd.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

     String HtmlCode=wd.getPageSource();
        Assert.assertTrue(HtmlCode.contains("New order has been successfully added."));
  wd.findElement(By.xpath("//a[@href='Default.aspx']")).click();

  String actualName=wd.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[2]")).getText();
  String providedName=line[0]+" "+line[1];
  Assert.assertEquals(actualName,providedName);

  String actualAddress=wd.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[6]")).getText();
  String providedAddress=line[2];
        Assert.assertEquals(actualAddress,providedAddress);


        String actualCity=wd.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[7]")).getText();
        String providedCity=line[3];
        Assert.assertEquals(actualCity,providedCity);

        /*String actualState=wd.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[8]")).getText();
        String providedState=line[4];
        Assert.assertEquals(actualState,providedState);*/

        String actualZipCode=wd.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[9]")).getText();
        String providedZipCode=line[5];
        Assert.assertEquals(actualZipCode,providedZipCode);

        wd.findElement(By.id("ctl00_logout")).click();










    }

        }








