package day03_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class c04_OtutomantionExercise {
    public static void main(String[] args) {
      // 1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().minimize();

        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com");

       // 3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement>LinkListesi=driver.findElements(By.tagName("a"));
        if (LinkListesi.size()==147){
            System.out.println("link listesi Passed");
        }else {
            System.out.println("sayfa da "+ LinkListesi.size()+" adet lınk var, test  field");
        }
        //4- Products linkine tiklayin

        driver.findElement(By.partialLinkText("Products")).click();

        //5- special offer yazisinin gorundugunu test edin

WebElement specialofferElement=driver.findElement(By.id("sale ımage"));

if (specialofferElement.isDisplayed()){
    System.out.println("special offer testi passed");
}else {
    System.out.println("special offer faıled");
}

       // 6- Sayfayi kapatin

       driver.close();
    }
}
