import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;

public class n11_auotomation_boran {
    public static void main(String[] args) throws InterruptedException, IOException {

        FindFile ff = new FindFile();
        ff.findFile("chromedriver.exe",new File("C:\\Users)"));

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.navigate().to("https://www.n11.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("ibrahimboran11@gmail.com"); //mail adresi girilir
        driver.findElement(By.id("password")).sendKeys("deneme1234"); //şifre girilir
        driver.findElement(By.id("loginButton")).click(); //login olunur
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.findElement(By.id("searchData")).sendKeys("bilgisayar"); //arama butonuna istenen kelime yazılır
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/a/span")).click(); //enter a basılır
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,5000)"); //sayfa aşağıya kaydırılır
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[4]/a[2]")).click(); //ikinci sayfa seçilir
        System.out.println(driver.getTitle());
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.cssSelector("#p-402393564 > div.pro > a > h3")).click(); //pc seçimi yapılır
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]")).click(); //sepete ekle
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/a")).click(); //sepete git
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[1]/div[2]/a/span/img")).click(); //tekrar ürüne gidip fiyata bakılır
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/a")).click(); //sepete git
        driver.findElement(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[1]")).click(); //ürün sayısı 1 arttırılır
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]")).click(); // sepet boşaltılır
        System.out.println(driver.getTitle());


    }

}

