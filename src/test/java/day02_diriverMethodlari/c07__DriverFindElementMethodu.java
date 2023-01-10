package day02_diriverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c07__DriverFindElementMethodu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");//yeni clas s açıtğınızda burayı not defteriner atın
        //o şekilde bakarak yazın hocam yolu yanlış verirseniz hata verir zaten maven geçince bu sorunla karşılaşmayacaksınız

        //başka bir sorun var mı hocam ? cok tesekkur ederım zahmet verdım hakkınızı helel adın problem değil hocam yardımcı olmaya
        //çalışıyorum hefesi kaçmasın insanların basit şeyler bunlar sagolun kolay gelsin

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

       WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
       aramakutusu.sendKeys("nutella");
       aramakutusu.submit();



        Thread.sleep(3000);
        driver.close();

    }
}
