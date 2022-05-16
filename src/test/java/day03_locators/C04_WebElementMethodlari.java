package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
      1-  amazon.com a gidip arama kutusunu locate edin
      2-arama kutusunun tagNmeının ınput oldugunu test edin
      3-arama kutusunun name attribute degerinin .... oldugunu test edin

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("tagname testi passed");
        }else {
            System.out.println("tagneme testi failed");
        }

        //        3-arama kutusunun name attribute degerinin .... oldugunu test edin
        String expectedNmeDeger="field-keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");
        if (expectedNmeDeger.equals(actualNameDegeri)){
            System.out.println("name attrıbute testti passed");
        }else {
            System.out.println("name attrıbute testti failed");

        }
        driver.close();
    }
}
