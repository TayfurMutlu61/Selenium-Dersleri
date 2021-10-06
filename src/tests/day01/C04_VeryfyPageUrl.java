package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VeryfyPageUrl {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // Youtube ana sayfasina gidelim https://www.techproeducation.com/
        //Sayfa URL’inin www.techproeducation.com oldugunu dogrulayin
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
        String expectedUrl="www.techproeducation.com";
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED");
            System.out.println("actual url= "+driver.getCurrentUrl());
        }
        driver.close();

    }
}
