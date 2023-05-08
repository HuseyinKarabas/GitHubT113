package practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class P02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
     . .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver. exetyi tanitalim
3-Driver'in tum ekranı kaplamasini sagu ayalim
4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
5-"https://www.otta.de" adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/" adresine gidip
9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
        driver.get("https://www.otta.de");
        String expectedKelime="OTTO";
        String ottoTitle=driver.getTitle();
        System.out.println("ottoTitle: "+ottoTitle);
        String ottoUrl= driver.getCurrentUrl();
        System.out.println("ottoUrl: "+ottoUrl);
        if(ottoTitle.contains("OTTO")&&ottoUrl.contains("OTTO")){
            System.out.println("OTTO yazisi her ikisinde de vardir  test PASSED");
        }else{
            System.out.println("En az birinde OTTO yoktur test FAILED");
        }
        Thread.sleep(3000);

        driver.navigate().to("https://wisequarter.com/");
        String wqTitle=driver.getTitle();
        System.out.println("wqTitle: "+wqTitle);

        boolean isTrue=wqTitle.contains("Quarter");
        if(isTrue){
            System.out.println("Your Test has PASSED");
        }else{
            System.out.println("Your Test has FAILED");
        }

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("All is well");
        driver.close();





    }
}
