package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Cssselector {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        // b. Locate email textbox
        Thread.sleep(2000);
        WebElement emailTextBox=driver.findElement(By.cssSelector(".form-control"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        //xpath de veya cssselectorde birden fazla buldugunda gonderdigimiz degeri ilkine yazar herzaman

        // c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input[id='session_password']"));//css ile uzun yazilis
       // WebElement passwordTextBox2=driver.findElement(By.cssSelector("#session_password"));//css ile kisa yazilis
        //WebElement passwordTextBox1= driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));

       passwordTextBox.sendKeys("Test1234!");
       // passwordTextBox1.sendKeys("Test1234!");
Thread.sleep(2000);
        // d. Locate signin button
        WebElement signButonu= driver.findElement(By.cssSelector("input[type='submit']"));
        signButonu.click();


        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
    }
}
