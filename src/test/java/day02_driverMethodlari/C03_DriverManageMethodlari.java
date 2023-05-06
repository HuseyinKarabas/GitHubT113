package day02_driverMethodlari;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
       //yazmazssak  System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        /*
        Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi, kodlar calismaya
        basladiginda biz driver icin yol gostermezsek Selenium kendi driver'ini devreye sokuyor
        ama baslangicta driver ayari aradigi icin biraz yavas calisir

        driver.manage().window(). istenen ayar ile window'umuzu istedigimiz boyuta getirebilir veya
        window'un konum ve buyukluk bilgilerine ulasabiliriz

        Biz genelde bir teste baslamadan once window'u maximize yapmayı tercih ederiz
         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        /*
        implicitlyWait bir websayfasi acilinciya veya aradigimiz elementler bulununcaya kadar
        driver'in bekleyecegi maximum sureyi belirler
         */

        driver.get("https://www.amazon.com");

        System.out.println("Baslangicta konum: "+driver.manage().window().getPosition());//(9, 9)
        System.out.println("Baslangicta boyut: "+driver.manage().window().getSize());// (1051, 806)

        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println("Maximize konum: "+driver.manage().window().getPosition());//(594, 40)
        System.out.println("Maximize boyut: "+driver.manage().window().getSize());//(1051, 805)

        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum: "+driver.manage().window().getPosition());//(1536, -216)
        System.out.println("Fullscreen boyut: "+driver.manage().window().getSize());//(1920, 1080)

        Thread.sleep(1000);
        driver.manage().window().minimize();
        System.out.println("Minimize konum: "+driver.manage().window().getPosition());//(1607, -260)
        System.out.println("Minimize boyut: "+driver.manage().window().getSize());//(1050, 805)

        //pencereyi istedigimiz boyut ve konuma getirelim
        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println("istedigimiz konum : "+driver.manage().window().getPosition()); //(48, 48)
        System.out.println("istedigimiz boyut : "+driver.manage().window().getSize());// (516, 502)

        Thread.sleep(3000);
        driver.close();
    }
}
