package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_Ornek4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
//doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");
        String actualTitle= driver.getTitle();
        String expectedTitle="youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("youtube içeriyor");
        }else{
            System.out.println(actualTitle);
        }
//3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="yotube";
        if(actualUrl.contains(expectedUrl)){
            System.out.println("içeriyor");
        }else {
            System.out.println("içermiyor"+actualUrl);
        }
//4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(4000);

//5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(4000);

//6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(4000);

//7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(4000);
//8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(4000);
//9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedIcerik="Amazon";
         actualTitle=driver.getTitle();

        if(actualTitle.contains(expectedIcerik)){
            System.out.println("Title Amazon iceriyor, Test PASSED");
        }else{
            System.out.println("Title Amazon icermiyor, Test FAILED");
        }
        Thread.sleep(4000);
//10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        expectedIcerik="amazon";
        actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Url amazon iceriyor, URL Test PASSED");
        }else{
            System.out.println("Url amazon iceriyor, URL Test FAILED");
        }
        Thread.sleep(4000);
//11.Sayfayi kapatin
        driver.close();



    }
}
