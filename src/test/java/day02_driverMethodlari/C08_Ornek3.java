package day02_driverMethodlari;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C08_Ornek3 {
    public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","src/resources/chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="facebook";

        if(actualTitle.contains(actualTitle)){
            System.out.println("esit");
        }else{
            System.out.println("gercek title"+actualTitle);
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedUrl="facebook";
        String actualUrl= driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("facebook kelimesi içeriyor");
        }else{
            System.out.println(actualUrl);
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        expectedUrl="Walmart.com";
        actualUrl= driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("içeriyor");
        }else{
            System.out.println("içermiyor"+actualUrl);
        }

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.Browser’i kapatin
        driver.close();





    }
}
