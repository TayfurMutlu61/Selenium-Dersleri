package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("test PASSED");
        } else {
            System.out.println("test FAILED");
            System.out.println("actualTitle= " + driver.getTitle());
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expextedUrl = "facebook";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expextedUrl)) {
            System.out.println("test PASSED");
        } else {
            System.out.println("test FAILED");
            System.out.println("actualUrl= " + driver.getCurrentUrl());
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitle1 = "Walmart.com";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("test PASSED");
        } else {
            System.out.println("test FAILED");
            System.out.println("actualTitle= " + driver.getTitle());
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();
    }
}
