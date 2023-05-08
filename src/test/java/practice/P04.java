package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {
    public static void main(String[] args) throws InterruptedException {

/*
Navigate to website https://testpages.herokuapp.com/styled/index.html
Under the ORIGINAL CONTENTS
click on Alerts
print the URL
navigate back
print the URL
Click on Basic Ajax
print the URL
enter value 20 and ENTER
and then verify Submitted Values is displayed open page
close driver
 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(3000);
        //click on Alerts
        driver.findElement(By.xpath("//a[@id='alerts']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        //Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='lteq30']")).sendKeys("20"+ Keys.ENTER);
        Thread.sleep(3000);
        String expectedKelime="Submitted Values";
        String actualResult=driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();
        if (expectedKelime.equals(actualResult)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        Thread.sleep(3000);
        driver.close();




    }
}
