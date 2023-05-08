package day05_relativeLocators_maven;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C02_MavenIlkClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        driver.close();


        /*mvnrepository.com   selenium java yaz enter a bas,bütün versiyonlar orada.4.9.0 a tıkla asagidaki
        dependencies kismini kopyala, projeyi ilk olusturuken maveni seçtiğimiz için maven projesinin kalbi pom.xml'dir.
        4 satirlik kodu. properties enter yap arayi aç < işareti koy dependencies geldi entere e bas arasina az önce
        kopyaladigimiz yaziyi ekle, 4.9.0 kirmizi oldu bu ariza demek.Sonra sağ üstte maven var oraya tiklayalim.Orada
        yenile tusuna basin maviler dolup bosalacak sonra yukariya dependencies gelece.Sonra finşzh.

        Tekrar mvnrepository.com  'a gelin WebDriverManager yazin bonigarcia 'yi alin en güncelini al kopyala
        dependencies'lerin arasina yapistir.5.3.2 en güncel tekrar yenile yapip yükleyebilirisin sag üstten.

        Sonra   github.com/SeleniumHQ/selenium
         */

        //maven.apache.org






    }
}
