package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_xpath {
    public static void main(String[] args) throws InterruptedException {

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tayfu\\OneDrive\\Belgeler\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        Thread.sleep(2000);
        //1-)WebElement addButonu=driver.findElement(By.tagName("button"));
       //2-) WebElement addButonu=driver.findElement(By.xpath("//button"));
       //3-) WebElement addButonu=driver.findElement(By.xpath("//button[text()='Add Element']"));
       //4-) WebElement addButonu=driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButonu=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButonu.click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete butpnu gorunurlugu PASS");
        }else {
            System.out.println("delete butpnu gorunurlugu FAILED");
        }
        //4- Delete tusuna basin
        deleteButonu.click();
        //5- Delete butonunun gorunur olmadigini test edin
        //**eger butona bastigimizda html kodundaki satir da siliniyorsa driveri in
        //o elemente ulasmasi mumukun olmayacagindan varligini yada yoklugunu test etmesi mumkun olmaz
        //var olan bir element bu sekilde silindikten sonra locate etmeye calisirsak
        //taleElementReferenceException hatasi aliriz
       /* if (deleteButonu.isDisplayed()){
            System.out.println("delete butpnu gorunurlugu PASS");
        }else {
            System.out.println("delete butpnu gorunurlugu FAILED");
        }*/
        //son soru bu sekilde cozulmez hata verir
        driver.close();
    }
}
