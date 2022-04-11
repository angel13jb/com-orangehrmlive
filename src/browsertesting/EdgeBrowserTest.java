package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();//using edgedriver
        driver.get(baseurl);//get url
        driver.manage().window().maximize();//maximize window size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title= driver.getTitle();
        System.out.println(title);
        //find username element
        WebElement userName=driver.findElement(By.name("txtUsername"));
        userName.sendKeys("Admin");
        //find password element
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        //closing browser
        driver.close();

    }
}
