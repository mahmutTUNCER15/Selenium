package practick;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    public static void main(String[] args) throws InterruptedException {
/*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        Thread.sleep(1000);

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();

        System.out.println("All Ok");



    }
}
