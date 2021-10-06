package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//1. Bir class oluşturun : AmazonSearchTest
//2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
// a.google web sayfasına gidin. https://www. amazon.com/
// b. Search(ara) “city bike”
// c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
// d. “Shopping” e tıklayın.
// e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

  driver.get("https://www.amazon.com/");

//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
// placeholder="" class="nav-input nav-progressive-attribute"
// dir="auto" tabindex="0" aria-label="Search">

        WebElement serachTextBox= driver.findElement(By.id("twotabsearchtextbox"));
        serachTextBox.sendKeys("city bike"+ Keys.ENTER);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement sonucYazisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());

    }
}
