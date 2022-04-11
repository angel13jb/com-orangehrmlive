package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();//using geckodriver
        driver.get(baseurl);//get url
        driver.manage().window().maximize();//maximize size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title=driver.getTitle();//title of page
        System.out.println(title);
        WebElement userName= driver.findElement(By.name("txtUsername"));//find username element
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.id("txtPassword"));//find password element
        password.sendKeys("admin123");
        //closing url
        driver.close();
    }
}
