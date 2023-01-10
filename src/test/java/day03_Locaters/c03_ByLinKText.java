package day03_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c03_ByLinKText {
    public static void main(String[] args) throws InterruptedException {
        //amazon ana sayfaya gıdın gıfcard lınkıne tıklayın
        //gıfcard sayfasına gıttıgını test edın
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().minimize();


        driver.get("https://www.amazon.com");
        WebElement giftCardLinki=driver.findElement(By.partialLinkText("Gift "));
        giftCardLinki.click();

        String expectedKelime="gift card";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.println("gift card testi passed");
        }else {
            System.out.println("gift card testi field");

        }
        Thread.sleep(3000);
        driver.close();
    }
}
