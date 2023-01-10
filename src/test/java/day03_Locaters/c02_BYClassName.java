package day03_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class c02_BYClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella");
        List<WebElement>fiyatlarListesi=driver.findElements(By.className("a-price-whole"));
        System.out.println(fiyatlarListesi);

        for (WebElement each:fiyatlarListesi
             ) {
            System.out.println(each.getText());
        }
        /*en yuksek fıyatı bulabılmek ıcın java bılgımızı kullanmalıyız.
        1 - web elementlerden getText ıle fıyatı strıng olarak alın
        2- Strıng fiyatı kıyaslama yapabılmek için Integer'a çevirin
            3- en yuksek fıyatı bulup yazdırın*/
        String fiyatStr;
        Integer fiyatInt;
        Integer EnYuksekFiyat = 0;

        for (WebElement each:fiyatlarListesi
        ) {
           fiyatStr= each.getText();
           fiyatInt=Integer.parseInt(fiyatStr);
           if (fiyatInt> EnYuksekFiyat){
               EnYuksekFiyat=fiyatInt;

           }
            System.out.println(" ");
            System.out.println("en yuksek fıyat");
        }
    Thread.sleep(3000);
        driver.close();
    }
}
