package day01_SeleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amozon.com");
        //driver.close();
        Thread.sleep(5000);
        driver.get("https://www.facebook.com");
        Thread.sleep(5000);
        driver.get("https://www.youtube.com");
        driver.close();


    }
}
