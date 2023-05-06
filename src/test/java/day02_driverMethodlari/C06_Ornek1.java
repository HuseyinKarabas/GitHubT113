package day02_driverMethodlari;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C06_Ornek1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //Youtube ana sayfasina gidelim . https://www.youtube.com
        driver.get("https://www.youtube.com/");

        //3. Amazon soyfasina gidelim. https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");

        //. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        Thread.sleep(3000);
        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //7. Sayfayi kapatalim / Tum sayfalari kapatalim
        Thread.sleep(3000);
        driver.close();


    }
}
