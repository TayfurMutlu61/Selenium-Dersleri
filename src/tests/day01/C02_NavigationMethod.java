package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethod {
    public static void main(String[] args) throws InterruptedException {
        //  1. Yeni bir Class olusturalim.(NavigationMethods)


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //    2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");
        Thread.sleep(1000);
        // 3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);
        //    4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(1000);
        //  5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(1000);
        // 6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(1000);
        // 7. Sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //   8. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
        Thread.sleep(1000);
        driver.quit();


    }
}
