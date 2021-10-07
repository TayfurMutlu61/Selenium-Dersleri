package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.



        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        System.setProperty("webdriver.chrome.driver","C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        WebElement signTusu= driver.findElement(By.id("sign-in"));
        signTusu.click();
        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
Thread.sleep(2000);
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signInButonu= driver.findElement(By.name("commit"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        WebElement dogruKullanici= driver.findElement(By.className("navbar-text"));
        String username="testtechproed@gmail.com";
        if (dogruKullanici.getText().equals(username)){
            System.out.println("dogru kullanici testi PASS");
        }else{
            System.out.println("dogru kullanici testi FAILLED");
        }

        Thread.sleep(2000);
        WebElement adressesLinki=driver.findElement(By.linkText("Addresses"));
        WebElement signLinki=driver.findElement(By.linkText("Sign out"));

        if (adressesLinki.isDisplayed()){
            System.out.println("addreses linki gozukuyor");
        }else
        {
            System.out.println("gorunmuyor tesxt failled");
        }

        //*****************
        if (signLinki.isDisplayed()){
            System.out.println("sign linki gozukuyor pass");
        }else
        {
            System.out.println("gorunmuyor tesxt failled");
        }

        //3. Sayfada kac tane link oldugunu bulun.


        Thread.sleep(1000);
        List<WebElement> linkSayisi= driver.findElements(By.tagName("a"));
        System.out.println("toplam link sayisi: "+linkSayisi.size());

        for (WebElement WB:linkSayisi) {
            System.out.println(WB.getText());
        }
        driver.close();
    }
}
