package day05_relativeLocators_maven;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C04_GoogleNutella {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        Thread.sleep(3000);
        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actaulTitle=driver.getTitle();
        //String expectedIcerik="Google";  böyle de yapilabilir
        if(actaulTitle.contains("Google")){
            System.out.println("Title Testi PASSED");
        }else{
            System.out.println("Title Testi FAILED");
        }
        Thread.sleep(3000);
        //5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Nutella");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
        Thread.sleep(3000);
        /*
         WebElement aramaKutusu= driver.findElement(By.xpath("//*[@name='q']"));
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
         */
        //6- Bulunan sonuc sayisini yazdirin
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(sonucYaziElementi.getText());
        Thread.sleep(3000);;

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String sonucYazisiStr= sonucYaziElementi.getText();
        String[] sonucYaziKelimeleriArr = sonucYazisiStr.split(" ");
        String sonucSayiAdediStr=sonucYaziKelimeleriArr[1]; // 130.000.000
        sonucSayiAdediStr = sonucSayiAdediStr.replaceAll("\\D",""); // "130000000"
        int sonucSayisiInt= Integer.parseInt(sonucSayiAdediStr);

        if (sonucSayisiInt>10000000){
            System.out.println("sonuc sayisi testi PASSED");
        }else{
            System.out.println("Sonuc sayisi testi FAILED");
        }
        //8- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();





    }
}
