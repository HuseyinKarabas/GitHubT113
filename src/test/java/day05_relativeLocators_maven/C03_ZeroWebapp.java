package day05_relativeLocators_maven;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C03_ZeroWebapp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        Thread.sleep(3000);

        //3. Login alanine  “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        Thread.sleep(3000);

        //4. Password alanina “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        //WebElement passwordKutusu= driver.findElement(By.id("user_password"));
        //        passwordKutusu.sendKeys("password");
        Thread.sleep(3000);

        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Thread.sleep(3000);

        //6. Back tusu ile sayfaya donun
        driver.navigate().back();
        Thread.sleep(3000);

        //7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath(" //li[@id='onlineBankingMenu']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(" //span[@id='pay_bills_link']")).click();
        Thread.sleep(3000);

        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("5000");
        //WebElement amountKutusu= driver.findElement(By.id("sp_amount"));
        //        amountKutusu.sendKeys("200");
        Thread.sleep(3000);
        //9. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        // WebElement tarihKutusu= driver.findElement(By.id("sp_date"));
        //        tarihKutusu.sendKeys("2020-09-10");
        Thread.sleep(3000);
        //10. Pay buttonuna tiklayin
        driver.findElement(By.xpath(" //input[@type='submit']")).click();
        //11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        Boolean isTrue=driver.findElement(By.xpath("//div[@id='alert_content']")).isDisplayed();
        if(isTrue){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        /*
         WebElement submittedYaziElementi= driver.findElement(By.id("alert_content"));
        if (submittedYaziElementi.isDisplayed()){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
         */
        Thread.sleep(3000);
        driver.close();




    }
}
