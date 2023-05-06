package day02_driverMethodlari;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C07_Ornek2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("maximize konum: "+driver.manage().window().getPosition());
        System.out.println("maximize boyut: "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("fullscreen konum: "+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut: "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //9. Sayfayi kapatin
        driver.close();

    }
}
