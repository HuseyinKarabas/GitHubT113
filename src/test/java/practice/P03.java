package practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class P03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                 /* ...Exercise3...
Navigate to  https://testpages.herokuapp.com/styled/index.html
Click on  Calculater under Micro Apps
Type any number in the first input
Type any number in the second input
Click on Calculate
Get the result
Print the result
      */
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(2000);
        //Click on  Calculater under Micro Apps
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
        Thread.sleep(2000);
        //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("15");
        Thread.sleep(2000);
        //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("10");
        Thread.sleep(2000);
        //Click on Calculate
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(2000);

        WebElement result=driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("result: "+result.getText());
        Thread.sleep(2000);
        driver.close();





    }
}
