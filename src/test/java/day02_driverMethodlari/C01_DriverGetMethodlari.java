package day02_driverMethodlari;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver/chromedriver.exe");
        //sisteme webdriver'in ne olacagini ve bu driver'in hangi dosya yolunda oldugunu soyler
        WebDriver driver=new ChromeDriver();
        //Bilgisayarinizdaki Chrome browser'in otomasyonla calisacak bir kopyasini olusturur
        //Chrome disinda bir browser kullanmak istersek o browser'in driver'ini indirip
        //System.setProperty("webdriver.csafari.driver","safari driver'in dosya yolu");

        //olusturdugumuz driver objesi bizm elimiz gozumuz gibidir.

        driver.get("https://www.amazon.com"); //istenen url'e bizi goturur
        //www yazmasak da calisir ama https:// yazmazsak calismaz

        System.out.println(driver.getTitle());//bize title dondurur
        //Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl());//gidilern url'i dondurur
        //https://www.amazon.com/

        System.out.println(driver.getPageSource());
        //gidilen web sayfasinin kaynak kodlarini dondurur

        System.out.println(driver.getWindowHandle());//2C69A8D42690A80FD3E12B9F96AAE3D7
        //acilan her bir pencereye verilen unique hash code degeridir

        System.out.println(driver.getWindowHandles()); //[62D91A4A74AFEB8852226A581E05C1C0]
        //eger driver calisirken birden fazla pencere veya tab olusturduysa acilan tum
        //windows/tab'lerin unique hash code'larini bir set olarak dondurur


        Thread.sleep(4000);//mili saniye olarak yazdigimiz sayi süresince kodu bekletir
        driver.close();//acilan browser'i kapatir




    }
}
