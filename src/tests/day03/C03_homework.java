package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_homework {
    //mehmet hocanin Batch 13 Java Instruction 01 Giris videosunu acma


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //1-)youtube sayfasina gidiniz
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
        //2-)search kismina mehmet bulutluoz  yazdiriniz
        WebElement searcTextBox=driver.findElement(By.xpath("//input[@id='search']"));
        searcTextBox.sendKeys("mehmet bulutluoz");
           Thread.sleep(1000);
           //3-)arama tusuna basiniz
       WebElement aramaTusu=driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
        aramaTusu.click();
        Thread.sleep(2000);
        //4-)Batch 13 Java Instruction 01 Giris bu videoyu aciniz
        WebElement ilkVideo=driver.findElement(By.partialLinkText("Batch 13 Java Instruction 01 Giris"));
        ilkVideo.click();
        Thread.sleep(1000);
        //5-)videoyu durdurunuz
       WebElement oynatTusu= driver.findElement(By.tagName("video"));
        oynatTusu.click();
        Thread.sleep(1000);
        //6-)videoyu tam ekran yapiniz
        WebElement fullScreen= driver.findElement(By.xpath("//button[@aria-label='Tam ekran (f)']"));
        fullScreen.click();
        //7-videoyu tekrar oynatiniz
        oynatTusu.click();
        //iyi seyirler "Mehmet Hoca ile java derslerine hosgeldiniz



    }
}
