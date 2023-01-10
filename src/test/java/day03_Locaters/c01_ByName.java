package day03_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c01_ByName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new  ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.name("Field-keywords"));

        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);


        Thread.sleep(3000);
        driver.close();
    }
}
