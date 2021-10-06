package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("suandaki url"+driver.getCurrentUrl());//bize url sini yazdirmak icin
        System.out.println("suandaki baslik"+driver.getTitle());//basligi verir yazdirmak icin sys nin icinde yazilir
        driver.manage().window().maximize();//window u maximize eder ve buyuk ekranda max sekilde acar
        Thread.sleep(3000);//bekletmek istedigimizzaman kullaniriz


        driver.navigate().to("https://www.techproeducation.com");//navigate ile bir ikinci adrese gitmek icin
        Thread.sleep(2000);
        driver.navigate().back();//tekrar amozona doner
        Thread.sleep(2000);

        driver.navigate().forward();//tekrar ileri gider
        Thread.sleep(2000);

        driver.navigate().refresh();//gittigi sayfayi yeniler
        Thread.sleep(2000);

        driver.quit();//quit birden fazla sayfa acilmissa hepsini kapatir
        driver.close();//close sadece oldugu sayfayi kapatir
    }
}
